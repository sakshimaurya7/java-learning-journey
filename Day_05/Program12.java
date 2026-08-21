package Day_05;
import java.util.Scanner;

public class Program12 {
    static int square(int number) {
        return number * number;
    }
    static int cube(int number) {
        return number * number * number;
    }
    static boolean isPositive(int number) {
        return number > 0;
        // if(number > 0){
        //     return true;
        // }
        // else {
        //     return false;
        // }
    }
    static boolean isEven(int number){
        return number % 2 == 0;
        // if(number % 2 == 0) {
        //     return true;
        // }
        // else {
        //     return false;
        // }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        System.out.println("Square     : " + square(num));
        System.out.println("Cube       : " + cube(num));
        System.out.println("Positive   : " + isPositive(num));
        System.out.println("Even       : " + isEven(num));
        

        sc.close();
    }
}
