package Day_06;
import java.util.Scanner;

//Find the Second Smallest
public class Challenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers : ");
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Input : ");
        for(int inputElement : array) {
            System.out.print(inputElement + " ");
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++) {
            if(array[i] < smallest) {
                secondSmallest = smallest;
                smallest = array[i];
            }
            else if(array[i] < secondSmallest && array[i] != smallest) {
                secondSmallest = array[i];
            }
        }

        System.out.println("\nSecond Smallest : " + secondSmallest);
        sc.close();
    }
}
