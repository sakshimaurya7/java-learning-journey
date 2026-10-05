package Day_23;
import java.util.HashSet;
import java.util.Scanner;

//Remove all Even numbers
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<>();
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter elements : ");
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            numbers.add(value);
        }

        System.out.println();
        System.out.println("HashSet : " + numbers);
        System.out.println();

        numbers.removeIf(value -> value % 2 == 0);

        System.out.println("After removing all even numbers : " + numbers);
        sc.close();
    }
}
