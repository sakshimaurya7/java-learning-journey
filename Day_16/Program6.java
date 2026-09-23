package Day_16;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements :");

        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        try {
            System.out.println("Enter index number : ");
            int index = sc.nextInt();

            System.out.println("The array element at index " + index + " is : " + array[index]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound. Please, enter a valid index.");
        }
        catch (InputMismatchException e) {
            System.out.println("Enter valid type of the index value.");
        }
        finally {
            System.out.println("Program completed.");
        }

        sc.close();
    }
}
