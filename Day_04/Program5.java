package Day_04;
import java.util.Scanner;

//Multiplication Table Take a number from the user
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int i;
        for ( i = 1 ; i <= 10 ; i++) {
            int mul = num * i;
            System.out.println(num + " * " + i + " = " + mul);
        }

        sc.close();
    }
}
