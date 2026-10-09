package Day_24;
import java.util.TreeSet;
import java.util.Scanner;

//Count Even & Odd numbers
public class Program5 {
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
        int evenCount = 0;
        int oddCount = 0;
        for(int value : list) {
            if(value % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }

        System.out.println("Even numbers : " + evenCount);
        System.out.println("Odd numbers : " + oddCount);
        sc.close();
    }
}
