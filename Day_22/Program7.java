package Day_22;
import java.util.LinkedList;
import java.util.Scanner;

//Count even and odd numbers in LinkedList
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        System.out.println();
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Enter elements : ");
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.add(value);
        }

        System.out.println();
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0) {
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