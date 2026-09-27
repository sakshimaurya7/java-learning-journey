package Day_19;
import java.util.Scanner;

//Take array elements from the user and find the smallest number.
public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter elements : ");
        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int smallest = array[0];
        for(int i = 1; i < array.length; i++) {
            if(smallest > array[i]) {
                smallest = array[i];
            }
        }

        System.out.println("Smallest element : " + smallest);
        sc.close();
    }
}
