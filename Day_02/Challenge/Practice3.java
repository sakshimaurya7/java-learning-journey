package Day_02.Challenge;
import java.util.Scanner;

//Take the user's name and age, then print a welcome message
public class Practice3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Welcome " + name);
        System.out.println("Your age is : " + age);

        sc.close();
    }
}
