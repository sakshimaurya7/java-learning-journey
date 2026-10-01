package Day_21;
import java.util.ArrayList;
import java.util.Scanner;

//Searching in ArrayList
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        System.out.println();
        for(int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            int value = sc.nextInt();
            numbers.add(value);
        }

        System.out.println();
        System.out.print("Enter number to search : ");
        int searchValue = sc.nextInt();

        System.out.println();
        if(numbers.contains(searchValue)) {
            System.out.println(searchValue + " is found in the ArrayList.");
        }
        else {
            System.out.println(searchValue + " is not found in the ArrayList.");
        }

        sc.close();
    }
}
