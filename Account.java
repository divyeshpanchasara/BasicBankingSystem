package bank;

public class Account {
    String userName;
    private int PIN;
    float balance;

    public void checkBalance(){
        System.out.println(this.balance);;
    }

    public void depositAmount(float amount){
        this.balance += amount;
        System.out.println("Amount Deposited, Balance : "+this.balance);
    }

    public void withdrawAmount(float amount){
        if( amount >= this.balance) System.out.println("Insufficient Funds!!");
        else {
            this.balance -= amount;
            System.out.println("Balance : "+this.balance);
        }
    }

    public int getPIN(){
        return PIN;
    }

    public void setPIN(int PIN){
        this.PIN = PIN;
    }

    public void getInfo(){
        System.out.println("+---------------------------+");
        System.out.println("Name --> "+this.userName);
        System.out.println("Balance --> "+this.balance);
    }

    public Account(String userName, int PIN){
        this.userName = userName;
        this.PIN = PIN;
    }
}
