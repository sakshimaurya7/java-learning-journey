package Day_20;
import java.util.Scanner;

//Take two matrices of the same size from the user and add them.
public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns : ");
        int columns = sc.nextInt();

        int[][] matrixA = new int[rows][columns];
        System.out.println();
        System.out.println("Enter First Matrix elements : ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        int[][] matrixB = new int[rows][columns];
        System.out.println();
        System.out.println("Enter Second Matrix elements : ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("First Matrix : ");
        for(int i = 0; i < matrixA.length; i++) {
            for(int j = 0; j < matrixA[i].length; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Second Matrix : ");
        for(int i = 0; i < matrixB.length; i++) {
            for(int j = 0; j < matrixB[i].length; j++) {
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Matrix Addition : ");
        int[][] result = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }  
}
