package Day_04;
import java.util.Scanner;

//Prime Number - Take a number from the user and check whether it is prime or not
public class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int prime = 0;
        for ( int i = 2 ; i < num ; i++ ) {
            prime = num % i;

            if ( prime == 0) {
                break;
            }
        }
        if ( num == 2 ){
            System.out.println( num + " is a prime number");
        }
        else if ( prime == 0) {
            System.out.println(num + " is not a prime number");
        }
        else {
            System.out.println(num + " is a prime number");
        }

        /*boolean isPrime = true;
        if(num <= 1) {
            isPrime = false;
        }
        else {
            for ( int i = 2; i < num; i++ ) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if ( isPrime ) {
            System.out.println(num + " is a prime number.");
        }
        else {
            System.out.println(num + " is not a prime number.");
        }*/

        /* More efficient
        for ( int i = 2; i * i <= num; i++ ) {
            if ( num % i == 0) {
                isPrime = false;
                break;
            }
        }*/
        sc.close();
    }
}
