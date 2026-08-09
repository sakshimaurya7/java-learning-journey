package Day_02.Challenge;
import java.util.Scanner;

//Take two numbers and print all arithmetic operations

public class Practice2 {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first number: ");
    int num1 = sc.nextInt();

    System.out.println("Enter second number: ");
    int num2 = sc.nextInt();

    System.out.println("Addition of two numbers: " + (num1 + num2));

    System.out.println("Subtraction of two numbers: " + (num1 - num2));

    System.out.println("Multiplication of two numbers: " + (num1 * num2));

    System.out.println("Division of two numbers: " + (num1 / num2));

    System.out.println("Modulus(remainder): " + (num1 % num2));

    sc.close();
}    
}
