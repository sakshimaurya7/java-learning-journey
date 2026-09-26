package Day_17;
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name : ");
        String fname = sc.next();

        System.out.print("Enter last name : ");
        String lname = sc.next();

        System.out.println("Full Name : " + fname.concat(" ").concat(lname));

        sc.close();
    }    
}
