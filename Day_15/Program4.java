package Day_15;


class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Program4 {
    static void withdrawAmount(double balance, double amount) throws InsufficientBalanceException {
        if(amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance.");
        }

        System.out.println("Withdrawal Successful.");
        System.out.println("Remaining Balance : " + (balance - amount));
    }    

    public static void main(String[] args) {
        try {
            withdrawAmount(20000, 21000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
