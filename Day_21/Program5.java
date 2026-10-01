package Day_21;
import java.util.ArrayList;
import java.util.Scanner;

//Remove an element from User Input
public class Program5 {
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
        System.out.println("Original ArrayList :  " + numbers);

        System.out.println();
        System.out.print("Enter element to remove : ");
        int removeValue = sc.nextInt();
        System.out.println();
        //This gives an array as it takes the index value to remove the element from the list.
        //numbers.remove(removeValue);

        if(numbers.contains(removeValue)) {
            numbers.remove(Integer.valueOf(removeValue));
            System.out.println("Element removed successfully.");
            System.out.println();
            System.out.println("Updated ArrayList : " + numbers);

        }
        else {
            System.out.println("Element not found.");
        }

        sc.close();

    }
}
