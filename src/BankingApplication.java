import java.util.Scanner;


public class BankingApplication {
    public static void main (String[] args){

    }
}

class BankAccount{
    int balance; // money you have in your account
    int previousTransaction; // the latest money drawn or deposited
    String customerName;
    String customerID;

    // constructor: same name as class and no return type
    BankAccount(String cname, String cid){
        this.customerName = cname;
        this.customerID = cid;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance += amount;
            previousTransaction = amount;
        }
    }// deposit

    void withdraw(int amount) {
        if (amount!=0) {
            balance -= amount;
            previousTransaction = (-amount);
        }
    }// withdraw

    void getPreviousTransaction(){
        if (previousTransaction>0){
            System.out.println("deposit: "+previousTransaction);
        }
        else if (previousTransaction<0){
            System.out.println("withdraw: "+Math.abs(previousTransaction));
        }else{
            System.out.println("There is no previosu transaction occured");
        }
    }

    void showMenu(){
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome "+customerName);
        System.out.println("Your ID is "+customerID);
        System.out.println('\n');
        System.out.println("A. Check Balance");
        System.out.println("B: Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do{
            System.out.println("-----");
        }while(true);

    }

}
