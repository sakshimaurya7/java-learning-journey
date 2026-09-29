package Day_20;
import java.util.Scanner;

//Display the elements of the main diagonal
public class Program8 {
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
        System.out.println("Main diagonal : ");
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if(i == j) {
                    System.out.println(array[i][j]);
                }
            }
        }

        sc.close(); 
    }   
}
