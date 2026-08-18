package Day_04.Challenge;
import java.util.Scanner;

//Number Analyzer
public class NumberAnalyzer {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number : ");
    int number = sc.nextInt();  
    int original = number;

    System.out.println("=======================================");
    System.out.println("\t NUMBER ANALYZER");
    System.out.println("=======================================");
    System.out.println("Number           : " + number );
    
    int count = 0;
    int reverse = 0;
    if ( original == 0) {
        count = 1;
    }
    else {
        while ( number > 0) {
            int digit = number % 10;
            number = number / 10;
            count ++;
            reverse = reverse * 10 + digit;
        }
    }

    System.out.println("Number of Digits : " + count);
    System.out.println("Reverse          : " + reverse);
    //Palindrome number
    if ( original == reverse ) {
        System.out.println("Palindrome       : Yes ");
    }
    else {
        System.out.println("Palindrome       : No ");
    }

    //Even / Odd number
    if ( original % 2 == 0) {
        System.out.println("Even/Odd         : Even");
    }
    else {
        System.out.println("Even/Odd         : Odd");
    }

    //Prime number or not
    boolean isPrime = true;
    if ( original <= 1) {
        isPrime = false;
    }
    else if ( original == 2) {
        isPrime = true;
    }
    else {
        for ( int i = 2; i * i <= original; i++ ) {
            if ( original % i == 0) {
                isPrime = false;
                break;
            }
        }
    }

    if( isPrime ) {
        System.out.println("Prime            : Yes");
    }
    else {
        System.out.println("Prime            : No");
    }
    System.out.println("=======================================");
    
    sc.close();

    }

}
