import java.text.BreakIterator;
import java.util.Scanner;


public class BankingApplication {
    public static void main (String[] args){
        BankAccount user = new BankAccount("Cony","cony123");
        user.showMenu();
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
            System.out.println("---------------------------------");
            System.out.println("Enter sn option ");
            System.out.println("---------------------------------");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option){
                case 'A':
                    System.out.println("---------------------------------");
                    System.out.println("Balance = "+balance);
                    System.out.println("---------------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("---------------------------------");
                    System.out.println("Enter an amount to deposit: ");
                    System.out.println("---------------------------------");
                    int deposit_amount = scanner.nextInt();
                    deposit(deposit_amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("---------------------------------");
                    System.out.println("Enter an amount to withdraw: ");
                    System.out.println("---------------------------------");
                    int withdraw_amount = scanner.nextInt();
                    withdraw(withdraw_amount);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("---------------------------------");
                    getPreviousTransaction();
                    System.out.println("---------------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("*********************************");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

        }while(option!='E');
        System.out.println("Thanks for using our service");
    }
}
