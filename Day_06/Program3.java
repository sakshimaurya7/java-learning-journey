package Day_06;
import java.util.Scanner;

//Count odd numbers in array
public class Program3 {
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
        
        int count = 0;
        for(int i =0; i < array.length; i++) {
            if(array[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("\nCount of Odd numbers : " + count);
    
        sc.close();
    }
}
