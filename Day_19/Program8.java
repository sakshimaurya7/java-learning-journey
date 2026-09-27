package Day_19;
import java.util.Scanner;

//Take an array from the user and then ask the user for a number to search.
public class Program8 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter elements : ");
        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter number to search : ");
        int searchItem = sc.nextInt();

        boolean found = false;
        for(int i = 0; i < array.length; i++) {
            if(searchItem == array[i]) {
                found = true;
                break;
            }            
        }

        if(found) {
            System.out.println(searchItem + " is present in the array.");
        }
        else {
            System.out.println(searchItem + " is not present in the array.");
        }
        sc.close();
    }
}
