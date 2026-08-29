package Day_06;
import java.util.Scanner;

//Find the second largest number in an array
public class Program6 {
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

        // Find the second largest number in the array
        /*int max = array[0];
        for(int i = 1; i < n; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }

        int secondmax = 0;
        for(int i = 0; i < n; i++) {
            if(array[i] != max) {
                secondmax = array[i];
                for(int j = 0; j < n; j++) {
                    if(array[j] != max && array[j] > secondmax) {
                        secondmax = array[j];
                    }
                }
            }
        }*/

        int largest = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++) {
            if(array[i] > largest) {
                secondmax = largest;
                largest = array[i];
            } else if(array[i] > secondmax && array[i] != largest) {
                secondmax = array[i];
            }
        }

        System.out.println("\nSecond largest number in the array : " + secondmax);

        sc.close();
    }
}
