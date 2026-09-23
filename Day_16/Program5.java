package Day_16;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter First number : ");
            int a = sc.nextInt();

            System.out.print("Enter second number : ");
            int b = sc.nextInt();

            System.out.println("Result : " + ( a / b));
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by zero is not allowed.");
        }
        catch (InputMismatchException e) {
            System.out.println("Type Mismatch occurred. Please, enter a valid value.");
        }

        sc.close();
    }
}
