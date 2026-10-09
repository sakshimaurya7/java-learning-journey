package Day_24;
import java.util.TreeSet;
import java.util.Scanner;

//Find Smallest and Largest
public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter elements : ");
        TreeSet<Integer> list = new TreeSet<>();
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.add(value);
        }

        System.out.println();
        System.out.println("TreeSet : " + list);
        System.out.println("Smallest Element : " + list.first());
        System.out.println("Largest Element : " + list.last());
        sc.close();
    }
}
