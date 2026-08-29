package Day_06;
import java.util.Scanner;

//Find Duplicate Elements
public class Challenge4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers : ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Input : ");
        for(int inputElement : array) {
            System.out.print(inputElement + " ");
        }

        System.out.println("\nDuplicate Elements : ");
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for(int k = 0; k < i; k++) {
                if(array[i] == array[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate) {
                continue;
            }
            for (int j = i+1; j < n; j++) {
                if(array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                    break;
                }
            }
        }

        sc.close();
    }
}
