import java.util.Scanner;
import bank.Account;
import bank.DataBase;

public class MainLogic {

    private static final Scanner sc = new Scanner(System.in);

    public static boolean exit(boolean execute){
        System.out.println("Would you like to exit?? Enter Y or N");
        char option = sc.next().charAt(0);
        return option != 'Y';
    }

    public static void clearScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    public static void greet(){
        System.out.println("\t\t\t\tWelcome To The Online Bank\n\n");
    }

    public static void displayOptions(){
        System.out.println("1-> View Balance\n2-> Deposit Amount\n3-> Withdraw Amount\n4-> Create new Account\n5-> Show Accounts\n6-> Exit");
        System.out.println("Enter 1, 2, 3, 4, 5 or 6 According to the service required");
    }

    public static int myChoice() {
        int choice = sc.nextInt();
        while ( choice < 1 || choice > 7) {
            System.out.println("INVALID OPTION!! please enter again!!");
            choice = sc.nextInt();
        }
        return choice;
    }

    public static boolean pinVerification(DataBase db, int index){
        System.out.print("Enter PIN: ");
        int enteredPIN = sc.nextInt();
        int actualPIN = db.get(index).getPIN();
        return actualPIN == enteredPIN;
    }

    public static int verifyUser(DataBase db){
        System.out.print("Enter Username: ");
        String reqName = sc.next();
        return db.checkInDataBase(reqName);
    }

    public static void createAccount(DataBase db){
        System.out.println("-----------------------------------------------");
        System.out.print("Enter new UserName: ");
        String name = sc.next();
        System.out.print("Enter Pin: ");
        int pin = sc.nextInt();
        Account acc = new Account(name, pin);
        db.myDataBase.add(acc);
        System.out.println("-----------------------------------------------");
    }

    public static void main(String[] args) {
        DataBase db = new DataBase(null, 0);
        boolean execute = true;
        while (execute) {
            clearScreen();
            greet();
            displayOptions();
            int choice = myChoice();
            if(choice == 1){
                int index =  verifyUser(db);
                if(index != -1){
                    if( pinVerification(db, index) ){
                        db.get(index).checkBalance();
                    }
                    else System.out.println("Worng Pin");
                }
                else System.out.println("Account dosent exist!!");
                execute = exit(execute);
            }   
            else if(choice == 2){
                int index =  verifyUser(db);
                if(index != -1){
                    if( pinVerification(db, index) ){
                        System.out.print("Enter Amount: ");
                        float amount = sc.nextFloat();
                        db.get(index).depositAmount(amount);
                    }
                    else System.out.println("Worng Pin");
                }
                else System.out.println("Account dosent exist!!");
                execute = exit(execute);
            }
            else if(choice == 3){
                int index =  verifyUser(db);
                if(index != -1){
                    if( pinVerification(db, index) ){
                        System.out.print("Enter Amount: ");
                        float amount = sc.nextFloat();
                        db.get(index).withdrawAmount(amount);
                    }
                    else System.out.println("Worng Pin");
                }
                else System.out.println("Account dosent exist!!");
                execute = exit(execute);
            }
            else if(choice == 4){
                createAccount(db);
                execute = exit(execute);
            }
            else if(choice == 5){
                db.showDataBase();
                execute = exit(execute);
            }
            else {
                execute = false;
            }
        }
    }
}
