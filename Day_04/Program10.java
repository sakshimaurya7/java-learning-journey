package Day_04;

import java.util.Scanner;

//Palindrome 
public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            reverse = reverse * 10 + digit;

        }
        System.out.println("Reverse : " +reverse);
        if (original == reverse) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

        sc.close();
    }
}
