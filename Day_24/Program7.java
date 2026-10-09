package Day_24;
import java.util.TreeSet;
import java.util.Scanner;

//Remove all even numbers
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        System.out.println();
        TreeSet<Integer> list = new TreeSet<>();
        System.out.println("Enter elements : ");
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.add(value);
        }

        System.out.println();
        System.out.println("TreeSet : " + list);
        System.out.println();
        list.removeIf(value -> value % 2 == 0);
        System.out.println("After removing even numbers : " + list);  
        sc.close();
    }
}