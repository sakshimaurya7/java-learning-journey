package Day_23;
import java.util.HashSet;
import java.util.Scanner;

//HashSet with Strings
public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names : ");
        int n = sc.nextInt();
        sc.nextLine();

        HashSet<String> names = new HashSet<>();
        System.out.println();
        System.out.println("Enter names : ");
        for(int i = 0; i < n; i++) {
            String str = sc.nextLine();
            names.add(str);
        }

        System.out.println();
        System.out.println("HashSet : " + names);
        System.out.println("Size : " + names.size());
        System.out.println();

        System.out.print("Enter name to search : ");
        String search = sc.nextLine();
        if(names.contains(search)) {
            System.out.println(search + " is present in the HashSet.");
        }
        else {
            System.out.println(search + " is not present in the HashSet.");
        }
        sc.close();
    }
}
