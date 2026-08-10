package Day_03;
import java.util.Scanner;

//Largest of two numbers
public class Program3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        if ( num1 > num2) {
            System.out.println("Largest : " + num1);
        }
        else {
            System.out.println("Largest : " + num2);
        }

        sc.close();
    }
}
