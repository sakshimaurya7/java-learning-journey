package Day_19;
import java.util.Scanner;

//Take array element from the user and display them in reverse order.
public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter elements : ");
        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Reverse Array : ");
        for(int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        
        sc.close();
    }
}
