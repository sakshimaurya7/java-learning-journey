package Day_17;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        try {
            System.out.print("Enter index : ");
            int n = sc.nextInt();

            System.out.println("Character : " + str.charAt(n));
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("Index is out of Bound. Please, enter a valid index value.");
        }
        
        sc.close();
    }
}