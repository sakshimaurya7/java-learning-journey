package Day_09;
import java.util.Scanner;

//create a BankAccount class with private variabled accountHolder, accountNumbe and balance and constructor, getters, setters, deposit and withdraw methods.
class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name : ");
        String accountHolder = sc.nextLine();

        System.out.print("Enter Account Number : ");
        int accountNumber = sc.nextInt();

        double balance;
        do {
            System.out.print("Enter Initial Balance : ");
            balance = sc.nextDouble();
            if (balance < 0) {
                System.out.println("Invalid Initial Balance. Please enter again.");
            }
        } while (balance < 0);

        BankAccount account = new BankAccount(accountHolder, accountNumber, balance);
        do {
            System.out.print("Enter Deposit Amount : ");
            double depositAmount = sc.nextDouble();
            if (depositAmount <= 0) {
                System.out.println("Invalid Deposit Amount. Please enter again.");
            } else {
                account.deposit(depositAmount);
                break;
            }
        } while (true);

        do {
            System.out.print("Enter Withdraw Amount : ");
            double withdrawAmount = sc.nextDouble();
            if (withdrawAmount <= 0 || withdrawAmount > account.getBalance()) {
                System.out.println("Invalid Withdraw Amount. Please enter again.");
            } else {
                account.withdraw(withdrawAmount);
                break;
            }
        } while (true);

        System.out.println("Account Holder : " + account.getAccountHolder());
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Balance : " + account.getBalance());

        sc.close();
    }
}
