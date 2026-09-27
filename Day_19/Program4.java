package Day_19;
import java.util.Scanner;

//Take numbers from the user and calculate their average.
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter elements : ");
        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = (double)sum / array.length;
        System.out.println("Average : " + average);
        sc.close();
    }   
}
