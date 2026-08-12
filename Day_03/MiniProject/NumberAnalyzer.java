package Day_03.MiniProject;

import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();
        System.out.println("");

        if(num > 0) {
            System.out.println("Positive Number");
        }
        else if (num < 0) {
            System.out.println("Negative Number");
        }
        else {
            System.out.println("Zero");
        }

        if ( num % 2 == 0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }

        if ( num % 5 == 0) {
            System.out.println("Divisible by 5");
        }
        else {
            System.out.println("Not divisible by 5");
        }

        if ( num >= 1 && num <= 100) {
            System.out.println("Number is within the range 1-100");
        }
        else {
            System.out.println("Number is outside the range 1-100");
        }

        sc.close();
    }
}