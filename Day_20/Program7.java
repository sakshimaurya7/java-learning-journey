package Day_20;
import java.util.Scanner;

//Calculate the sum of each column
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns : ");
        int columns = sc.nextInt();

        int[][] array = new int[rows][columns];

        System.out.println();
        System.out.println("Enter array elements : ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        for(int j = 0; j < array[0].length; j++) {
            int sum = 0;
            for(int i = 0; i < array.length; i++) {
                sum += array[i][j];
            }
            System.out.println("Sum of column " + (j+1) + " = " + sum);
        }

        sc.close(); 
    }
}
