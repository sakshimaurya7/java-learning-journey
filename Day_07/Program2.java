package Day_07;
import java.util.Scanner;

//Count Characters
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String input = sc.nextLine();
        System.out.println(input.length());

        sc.close();
    }
}
