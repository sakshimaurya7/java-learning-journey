package Day_22;
import java.util.LinkedList;
import java.util.Scanner;

//Reverse a LinkedList
public class Program6 {
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
        System.out.println("Original LinkedList : "  + list);

        System.out.println();
        LinkedList<Integer> reversedList = new LinkedList<>();
        for(int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        System.out.println("Reversed LinkedList : " + reversedList);
        sc.close();
    }
}