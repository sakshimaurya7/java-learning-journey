package Day_21;
import java.util.ArrayList;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            int value = sc.nextInt();

            numbers.add(value);
        }

        System.out.println();
        System.out.println("ArrayList :  " + numbers);
        System.out.println("Size : " + numbers.size());

        System.out.println();
        System.out.println("Elements : ");
        for(int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        sc.close();
    }    
}
