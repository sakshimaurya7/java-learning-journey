package Day_06;
import java.util.Scanner;

//Check if array is sorted or not
public class Challenge3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter " + n + " numbers : ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Input : ");
        for(int inputElement : array) {
            System.out.print(inputElement + " ");
        }

        boolean isSorted = true;
        for(int i = 0; i < n-1; i++) {
            if(array[i] > array[i+1]) {
                isSorted = false;
                break;
            }
        }

        if(isSorted) { 
            System.out.println("\nArray is sorted.");
        }
        else { 
            System.out.println("\nArray is not sorted.");
        }

        sc.close();
    }
}
