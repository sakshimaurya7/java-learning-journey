package Day_16;
import java.util.Scanner;

public class Program9 {
    static void checkNumber(int number) throws Exception {
        if(number < 0) {
            throw new Exception("Negative number is not allowed.");
        }
        System.out.println("Valid number.");
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter number : ");
            int number = sc.nextInt();
            checkNumber(number);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        sc.close();
    }
}
