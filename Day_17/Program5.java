package Day_17;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First string : ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string : ");
        String str2 = sc.nextLine();

        if(str1.equals(str2)) {
            System.out.println("Strings are equal.");
        }
        else {
            System.out.println("Strings are not equal.");
        }

        sc.close();
    }
}
