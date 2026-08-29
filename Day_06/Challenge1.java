package Day_06;
import java.util.Scanner;

//Count Positive, Negative and Zero numbers in an array
public class Challenge1 {
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
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for(int i = 0; i < n; i++) {
            if(array[i] > 0) {
                positiveCount++;
            }
            else if(array[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("\nPositive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zero numbers: " + zeroCount);

        sc.close();
    }
}
