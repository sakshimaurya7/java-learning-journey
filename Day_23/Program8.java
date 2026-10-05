package Day_23;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

//HAshSet Traversal
public class Program8 {
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
        System.out.println("Using Enhanced for loop : ");
        for(int value : numbers) {
            System.out.println(value);
        }

        System.out.println();
        System.out.println("Using forEach() : ");
        numbers.forEach(value -> System.out.println(value));

        System.out.println();
        System.out.println("Using Iterator : ");
        Iterator<Integer> iterator = numbers.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        sc.close();
    }
}
