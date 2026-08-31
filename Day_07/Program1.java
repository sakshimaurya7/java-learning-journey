package Day_07;
import java.util.Scanner;

//Take a String from the user and Print Each Character
public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String input = sc.nextLine();
        System.out.println(input);
        for(int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }

        sc.close();
    }
}
