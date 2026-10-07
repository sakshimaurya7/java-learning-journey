package Day_23;
import java.util.HashSet;
import java.util.Scanner;

public class Program10 {
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
        System.out.println("Unique names : " + names);
        System.out.println();
        System.out.println("Total names entered : " + n);
        System.out.println("Unique names : " + names.size());
        int duplicates = n - names.size();
        System.out.println("Duplicate entries : " + duplicates);
        sc.close();
    }    
}
