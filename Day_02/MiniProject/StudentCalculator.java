package Day_02.MiniProject;
import java.util.Scanner;

public class StudentCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("===============================");
        System.out.println("\t STUDENT CALCULATOR");
        System.out.println("===============================");
        System.out.println("Student : " + name);
        System.out.println("First Number : " + num1);
        System.out.println("Second Number : " + num2);
        System.out.println();
        System.out.println("Addition       : " + (num1 + num2));
        System.out.println("Subtraction    : " + (num1 - num2));
        System.out.println("Multiplication : " + (num1 * num2));
        System.out.println("Division       : " + (num1 / num2));
        System.out.println("Remainder      : " + (num1 % num2));
        System.out.println("===============================");


        sc.close();
    }
}
