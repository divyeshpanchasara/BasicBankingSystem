import java.util.Scanner;
import bank.DataBase;
import bank.functionsOfMainLogic;

public class MainLogic {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        DataBase db = new DataBase(null, 0);
        boolean execute = true;
        while (execute) {
            functionsOfMainLogic.clearScreen();
            functionsOfMainLogic.greet();
            functionsOfMainLogic.displayOptions();
            int choice = functionsOfMainLogic.myChoice();
            if(choice == 1){
                int index =  functionsOfMainLogic.verifyUser(db);
                if(index != -1){
                    if( functionsOfMainLogic.pinVerification(db, index) ){
                        db.get(index).checkBalance();
                    }
                    else System.out.println("Worng Pin");
                }
                else System.out.println("Account dosent exist!!");
                execute = functionsOfMainLogic.exit(execute);
            }   
            else if(choice == 2){
                int index =  functionsOfMainLogic.verifyUser(db);
                if(index != -1){
                    if( functionsOfMainLogic.pinVerification(db, index) ){
                        System.out.print("Enter Amount: ");
                        float amount = sc.nextFloat();
                        db.get(index).depositAmount(amount);
                    }
                    else System.out.println("Worng Pin");
                }
                else System.out.println("Account dosent exist!!");
                execute = functionsOfMainLogic.exit(execute);
            }
            else if(choice == 3){
                int index =  functionsOfMainLogic.verifyUser(db);
                if(index != -1){
                    if( functionsOfMainLogic.pinVerification(db, index) ){
                        System.out.print("Enter Amount: ");
                        float amount = sc.nextFloat();
                        db.get(index).withdrawAmount(amount);
                    }
                    else System.out.println("Worng Pin");
                }
                else System.out.println("Account dosent exist!!");
                execute = functionsOfMainLogic.exit(execute);
            }
            else if(choice == 4){
                functionsOfMainLogic.createAccount(db);
                execute = functionsOfMainLogic.exit(execute);
            }
            else if(choice == 5){
                db.showDataBase();
                execute = functionsOfMainLogic.exit(execute);
            }
            else {
                execute = false;
            }
        }
    }
}
