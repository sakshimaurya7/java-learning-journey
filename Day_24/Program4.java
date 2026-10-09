package Day_24;
import java.util.TreeSet;
import java.util.Scanner;

//Remove an Element from TreeSet
public class Program4 {
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
        System.out.print("Enter number to remove : ");
        int remove = sc.nextInt();
        if(list.remove(remove)) {
            System.out.println(remove + " removed successfully.");
            System.out.println();
            System.out.println("After removing " + remove + " : " + list);
        }
        else {
            System.out.println(remove + " is not present in the TreeSet.");
        }

        sc.close();
    }
}
