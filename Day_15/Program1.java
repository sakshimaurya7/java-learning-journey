package Day_15;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        
        try {
            System.out.println(a / b);
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        sc.close();
    }
}
