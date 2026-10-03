package Day_22;
import java.util.LinkedList;
import java.util.Scanner;

//Remove all Even numbers from LinkedList
public class Program9 {
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
        System.out.println("Original LinkedList : " + list);
        System.out.println();

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0) {
                list.remove(i);
                i--; // Decrement index to account for the removed element
            }
        }

        System.out.println("After removing all even numbers : " + list);
        sc.close();
    }
}