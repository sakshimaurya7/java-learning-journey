package Day_19;
import java.util.Scanner;

//Ask the user to enter the size of the array and then enter all the elements.
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println("Array elements : ");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        sc.close();
    }
}
