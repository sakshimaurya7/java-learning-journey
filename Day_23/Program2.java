package Day_23;
import java.util.HashSet;
import java.util.Scanner;

//HashSet with User Input
public class Program2 {
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
        System.out.println("Size : " + numbers.size());

        System.out.println();
        System.out.print("Enter number to search : ");
        int search = sc.nextInt();
        if(numbers.contains(search)) {
            System.out.println(search + " is present in the HashSet.");
        }
        else {
            System.out.println(search + " is not present in the HashSet.");
        }

        sc.close();
    }
}
