package Day_04;
import java.util.Scanner;

//Sum of 1 to N 
//Take N from the user
public class Program6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print( "Enter N : ");
        int n = sc.nextInt();

        int sum = 0;
        for ( int i = 1 ; i <= n ; i++ ) {
            sum += i;
        }
        System.out.println("Sum = " + sum);

        sc.close();
    }    
}
