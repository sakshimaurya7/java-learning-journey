package Day_04;
import java.util.Scanner;

//Print first N fibonacci numbers
public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        int n = sc.nextInt();

        /*if( n == 1){
            System.out.println("0");
        }
        else {
            int first = 0;
            int second = 1;
            System.out.println(first);
            System.out.println(second);
            for ( int i = 2; i < n ; i++ ) {
                int next = first + second;
                System.out.println(next);
                first = second;
                second = next;
            }
        }*/

        if ( n <= 0) {
            System.out.println("Enter a Positive number.");
        }
        else {
            int first = 0;
            int second = 1;
            for ( int i = 1; i <= n; i++) {
                if( i == 1) {
                    System.out.println(first);
                }
                else if ( i == 2) {
                    System.out.println(second);
                }
                else {
                    int next = first + second;
                    System.out.println(next);
                    first = second;
                    second = next;
                }
            }
        }

        sc.close();
    }
}
