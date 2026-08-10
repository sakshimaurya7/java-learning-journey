package Day_03;
import java.util.Scanner;

//Voting Eligibility
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = sc.nextInt();

        if ( age >= 18) {
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not Eligible to vote");
        }

        sc.close();
    }
}
