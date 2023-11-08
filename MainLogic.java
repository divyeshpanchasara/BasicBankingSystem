import bank.DataBase;
import bank.functionsOfMainLogic;

public class MainLogic {
    public static void main(String[] args) {
        
        DataBase db = new DataBase(null, 0);
        boolean execute = true;
        
        while (execute) {
            functionsOfMainLogic.clearScreen();
            functionsOfMainLogic.greet();
            functionsOfMainLogic.displayOptions();
            int choice = functionsOfMainLogic.myChoice();
            if(choice == 1) functionsOfMainLogic.executeCheckBalance(db);
            else if(choice == 2) functionsOfMainLogic.executeDepositeAmount(db);
            else if(choice == 3) functionsOfMainLogic.executeWithdrawAmount(db);
            else if(choice == 4) functionsOfMainLogic.createAccount(db);
            else if(choice == 5) db.showDataBase();
            execute = functionsOfMainLogic.exit(execute);
        }
    }
}
