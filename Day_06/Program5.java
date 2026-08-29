package Day_06;
import java.util.Scanner;

//Search an element in array
public class Program5 {
    static int search(int[] array, int target) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == target) {
                return i; // Return the index of the target element
            }
        }
        return -1; // Return -1 if the target element is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter " + n + " numbers : ");
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Input : " );
        for(int inputElement : array) {
            System.out.print(inputElement + " ");
        }

        System.out.println("\nEnter the number to search : ");
        int target = sc.nextInt();

        int resultIndex = search(array, target);
        if(resultIndex != -1) {
            System.out.println("Element found at index: " + (resultIndex+1));
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
