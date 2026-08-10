package Day_03;
import java.util.Scanner;

//take a number from user and show whether it is positive, negative or zero
public class Program1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0){
            System.out.println("Positive number");
        }
        else if (num < 0) {
            System.out.println("Negative Number");
        }
        else {
            System.out.println("Zero");
        }

        sc.close();
    }    
}
