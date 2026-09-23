package Day_16;

public class Program1 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 2;
            System.out.println("Result : " + (a / b));
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by Zero.");
        }
        finally {
            System.out.println("Finally block executed.");
        }
    }
}
