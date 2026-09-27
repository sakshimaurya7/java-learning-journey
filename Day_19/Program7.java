package Day_19;
import java.util.Scanner;

//Take numbers from the user and count how many are even and how many are odd.
public class Program7 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter elements : ");
        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int countEven = 0;
        int countOdd = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                countEven++;
            }
            else {
                countOdd++;
            }
        }

        System.out.println("Even numbers : " + countEven);
        System.out.println("Odd numbers : " + countOdd);
        sc.close();
    }
}
