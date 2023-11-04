package bank;

import java.util.ArrayList;

public class DataBase extends Account{

    public ArrayList<Account> myDataBase = new ArrayList<Account>();

    public DataBase(String userName, int PIN) {
        super(userName, PIN);
    }

    public void add(Account acc){
        myDataBase.add(acc);
    }

    public Account get(int index){
        return myDataBase.get(index);
    }

    public int checkInDataBase(String reqAccount){
        for(int i = 0; i < myDataBase.size() ; i++){
            if( myDataBase.get(i).userName.equals(reqAccount) ){
                System.out.println("account found");
                return i;
            } 
        }
        return -1;
    }

    public void showDataBase(){
        int i = 0;
        System.out.println("Printing Database");
        for(i = 0; i < myDataBase.size() ; i++){
            myDataBase.get(i).getInfo();
        }
        System.out.println("+---------------------------+");
        System.out.println(i + " Account(s) Displayed!!");
    }
}
