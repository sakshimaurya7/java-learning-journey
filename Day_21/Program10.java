package Day_21;
import java.util.ArrayList;
import java.util.Scanner;

//Remove all even numbers from an ArrayList
public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter elements : ");
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            numbers.add(value);
        }

        System.out.println();
        System.out.println("ArrayList : " + numbers);
        System.out.println();

        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--; // Decrement i to check the new element at this index
            }
        }

        /*
        for(int i = numbers.size() - 1; i >= 0; i--) {
        if(numbers.get(i) % 2 == 0) {
            numbers.remove(i);
        }
        } */

        System.out.println("ArrayList after removing even numbers : " + numbers);
        sc.close();
    }
}
