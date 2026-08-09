package Day_02.Challenge;
import java.util.Scanner;

//Take two numbers from the user and print their sum

public class Practice1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("Addition of two numbers: " + sum);

        sc.close();
    }
    
}
