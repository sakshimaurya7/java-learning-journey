package Day_24;
import java.util.TreeSet;
import java.util.Scanner;

//Remove Duplicate Numbers and Count Them
public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        System.out.println();
        TreeSet<Integer> numbers = new TreeSet<>();
        System.out.println("Enter elements : ");
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            numbers.add(value);
        }

        System.out.println();
        System.out.println("TreeSet : " + numbers);
        System.out.println();
        int duplicates = n - numbers.size();
        System.out.println("Total elements entered : " + n);
        System.out.println("Unique elements : " + numbers.size());
        System.out.println("Duplicate enteries : " + duplicates);
        sc.close();
    }
}
