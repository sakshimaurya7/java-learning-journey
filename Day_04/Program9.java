package Day_04;
import java.util.Scanner;

//Reverse a number
public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        //String reverse = "";
        int reverse = 0;

        while ( num > 0 ) {
            int digit = num % 10;
            num = num / 10;
            reverse = reverse * 10 + digit;
            //reverse +=digit;
        }
        System.out.println("Reverse number : " + reverse);

        sc.close();
    }
}
