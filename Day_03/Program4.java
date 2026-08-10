package Day_03;
import java.util.Scanner;

//Largest of three numbers
public class Program4 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter third number : ");
        int num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Largest number : " + num1);
            }
            else {
                System.out.println("Largest number : " + num3);
            }
        }
        else if (num2 > num3){
            System.out.println("Largest number : " + num2);
        }
        else {
            System.out.println("Largest number : " + num3);
        }

        sc.close();
    }
}
