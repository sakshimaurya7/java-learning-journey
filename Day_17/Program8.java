package Day_17;
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        System.out.print("Enter strating index : ");
        int start = sc.nextInt();

        System.out.print("Enter ending index : ");
        int end = sc.nextInt();

        System.out.println("Substring : " + str.substring(start, end));

        sc.close();
    }    
}
