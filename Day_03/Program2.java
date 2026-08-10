package Day_03;
import java.util.Scanner;

//find the entered number is even or odd
public class Program2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
        
        sc.close();
    }
}
