package Day_20;
import java.util.Scanner;

//Take a 2D array from the user and find the largest element.
public class Program4 {
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

        int largest = array[0][0];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if(largest < array[i][j]){
                    largest = array[i][j];
                }
            }
        }

        System.out.println();
        System.out.println("Largest element = " + largest);
        sc.close();        
    }
}
