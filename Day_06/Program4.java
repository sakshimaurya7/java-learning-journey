package Day_06;
import java.util.Scanner;

//Reverse an array
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter " + n + " numbers : ");
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Original Array : ");
        for(int arrayElement : array) {
            System.out.print(arrayElement + " ");
        }

        //Reverse the array
        for(int i = 0; i < n/2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }

        System.out.println("\n Reversed Array : ");
        for(int arrayElement : array) {
            System.out.print(arrayElement + " ");
        }

        sc.close();
    }    
}
