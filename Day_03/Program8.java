package Day_03;
import java.util.Scanner;

//take a year and determine whether it is a leap year
public class Program8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year : ");
        int year = sc.nextInt();

        if ( year % 4 == 0) {
            if ( year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println(year + " is a Leap year.");
                }
                else {
                    System.out.println(year + " is not a Leap year.");
                }
            }
            else {
                System.out.println(year + " is a Leap year.");
            }
        }
        else {
            System.out.println( year + " is not a Leap year.");
        }

        sc.close();
    }
    
}
