package Day_05;

import java.util.Scanner;

public class Program11 {
    static int add(int a, int b) {
        return a+b;
    }    
    static int subtract(int a, int b) {
        return a-b;
    }
    static int multiply(int a, int b) {
        return a*b;
    }
    static double divide(int a, int b) {
        if( b == 0) {
            return 0;
        }
        return (double) a/b;
    }
    static int remainder(int a, int b) {
        return a%b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        if (num2 == 0) {
            System.out.println("Second number cannot be zero.");
        }
        else {
            System.out.println("Addition       : " + add(num1,num2));
            System.out.println("Substraction   : " + subtract(num1, num2));
            System.out.println("Multiplication : " + multiply(num1, num2));
            System.out.println("Division       : " + divide(num1, num2));
            System.out.println("Remainder      : " + remainder(num1, num2));
        }
        
        sc.close();
    }
}
