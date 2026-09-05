package Day_08;
import java.util.Scanner;

//Create a BankAccount class with methods deposit, withdraw, displayBalance and displayAccountDetails.
class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
        else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    void withdraw(double amount) {
        if(amount > 0 &&amount <= balance) {
            balance -= amount;
        }
        else if(amount <= 0) {
            System.out.println("Invalid Withdrawal Amount");
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Final Balance : " + balance);
    }

    void displayAccountDetails() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Initial Balance : " + balance);
    }

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

public class Challenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Holder Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number : ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter Initial Balance : ");   
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(name, accountNumber, initialBalance);
        account.displayAccountDetails();
        System.out.print("Deposit Amount : ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        System.out.print("Withdraw Amount : ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        account.displayBalance();

        sc.close();
    }
}
