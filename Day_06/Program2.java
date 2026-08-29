package Day_06;
import java.util.Scanner;


//count Even Numbers in Array
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int n = sc.nextInt();

        int[] input = new int[n];
        System.out.println("Enter " + n + " numbers : ");
        for(int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        System.out.print("Input : " );
        for(int inputElement : input) {
            System.out.print(inputElement + " ");
        }

        int count = 0;
        for(int inputElement : input) {
            if(inputElement % 2 == 0) {
                count++;
            }
        }

        System.out.println("\n Count of Even Numbers : " + count);

        sc.close();
    }
}
