package Day_19;
import java.util.Scanner;

//Take array elements from the user and find the largest number.
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter elements : ");
        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int largest = array[0];
        for(int i = 1; i < array.length; i++) {
            if(largest < array[i]) {
                largest = array[i];
            }
        }

        System.out.println("Largest element : " + largest);
        sc.close();
    }
}
