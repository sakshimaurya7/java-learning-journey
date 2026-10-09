package Day_24;
import java.util.TreeSet;
import java.util.Scanner;

//TreeSet with User Input
public class Program2 {
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
        System.out.println("Size : " + numbers.size());
        System.out.println();
        System.out.print("Enter number to search : ");
        int search = sc.nextInt();
        if(numbers.contains(search)) {
            System.out.println(search + " is present in the TreeSet.");
        }
        else {
            System.out.println(search + " is not present in the TreeSet.");
        }

        sc.close();
    }
}
