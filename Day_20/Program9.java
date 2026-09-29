package Day_20;
import java.util.Scanner;

//Take a matrix and display its transpose.
public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns : ");
        int columns = sc.nextInt();

        int[][] array = new int[rows][columns];
        System.out.println();
        System.out.println("Enter elements : ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Original Array : ");
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Transpose Matrix : ");
        for(int i = 0; i < columns; i++) {
            for(int j = 0; j < rows; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
