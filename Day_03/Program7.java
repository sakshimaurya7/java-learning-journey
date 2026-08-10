package Day_03;
import java.util.Scanner;

//take a number and check whether it is divisible by both 5 and 11
public class Program7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();

        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println(num + " is divisible by both 5 and 11");
        }
        else {
            System.out.println("Not Divisible by both 5 and 11");
        }

        sc.close();
    }
    
}
