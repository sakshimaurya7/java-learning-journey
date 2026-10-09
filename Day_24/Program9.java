package Day_24;
import java.util.TreeSet;
import java.util.Scanner;

//TreeSet with strings
public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names : ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();
        TreeSet<String> names = new TreeSet<>();
        System.out.println("Enter names : ");
        for(int i = 0; i < n; i++) {
            String name = sc.nextLine();
            names.add(name);
        }

        System.out.println();
        System.out.println("TreeSet : " + names);
        System.out.println("Unique names : " + names.size());
        System.out.println();
        System.out.print("Enter name to search : ");
        String search = sc.nextLine();
        if(names.contains(search)) {
            System.out.println(search + " is present in the TreeSet");
        }
        else {
            System.out.println(search + " is not present in the TreeSet");
        }

        sc.close();
    }
}
