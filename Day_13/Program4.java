package Day_13;

interface Payment {
    void pay();
}

class UPI implements Payment {
    @Override 
    public void pay() {
        System.out.println("Payment through UPI.");
    }
}

class CreditCard implements Payment {
    @Override 
    public void pay() {
        System.out.println("Payment through Credit card.");
    }
}

class Cash implements Payment {
    @Override 
    public void pay() {
        System.out.println("Payment through cash.");
    }
}

public class Program4 {
    public static void main(String[] args) {
        Payment payment;

        payment = new UPI();
        payment.pay();

        payment = new CreditCard();
        payment.pay();

        payment = new Cash();
        payment.pay();
    }    
}
