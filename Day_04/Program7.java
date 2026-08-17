package Day_04;
import java.util.Scanner;

//Find Factorial of a number
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int factorial = 1;

        for ( int i = num ; i >=1 ; i--) {
            factorial *= i;
        }
        System.out.println("Factorial = " + factorial);

        sc.close();
    }
}
