package Day_19;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element " + i + ": ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Array elements : ");

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();
    }    
}
