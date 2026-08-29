package Day_06;
import java.util.Scanner;

//Print Array ELements, calculate Sum, Average, Max, Min
public class Program1 {

    static int calculateSum(int[] array) {
        int sum = 0;
        for(int i =0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static int min(int[] array) {
        int min = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] a1 = new int[n];
        System.out.println("Enter " + n + " numbers : ");
        for(int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }

        for(int a : a1) {
            System.out.println("Array Elements : " + a);
        }

        System.out.println("Sum of Array Elements : " + calculateSum(a1));

        System.out.println("Average of Array Elements : " + (double)calculateSum(a1)/n);

        System.out.println("Maximum number from array : " + max(a1));

        System.out.println("Minimum number from array : " + min(a1));
        

        sc.close();
       
    }
}
