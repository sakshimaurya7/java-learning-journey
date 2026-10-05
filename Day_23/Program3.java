package Day_23;
import java.util.HashSet;
import java.util.Scanner;

//Remove an Element
public class Program3 {
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
        System.out.print("Enter number to remove : ");
        int remove = sc.nextInt();
        System.out.println();
        if(numbers.remove(remove)) { 
            System.out.println("After removing " + remove + " : " + numbers);
            System.out.println("Size : " + numbers.size());
        }
        else {
            System.out.println(remove + " is not present in the HashSet.");
        }
        sc.close();
    }
}
