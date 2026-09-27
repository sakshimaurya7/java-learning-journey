package Day_19;
import java.util.Scanner;

//Take numbers from the user and count Positive no., Negative no. and zeros.
public class Program10 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter elements : ");
        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] < 0) {
                negativeCount++;
            }
            else if(array[i] > 0) {
                positiveCount++;
            }
            else {
                zeroCount++;
            }
        }

        System.out.println("Positive numbers : " + positiveCount);
        System.out.println("Negative numbers : " + negativeCount);
        System.out.println("Zeros : " + zeroCount);
        sc.close();
    }
}
