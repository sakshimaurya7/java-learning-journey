package Day_22;
import java.util.LinkedList;
import java.util.Scanner;

//Largest & Smallest in LinkedList
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println();
        System.out.println("Enter elements : ");
        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.add(value);
        }

        System.out.println();
        System.out.println("LinkedList : " + list);
        System.out.println();

        int largest = list.get(0);
        int smallest = list.get(0);
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i)  > largest) {
                largest = list.get(i);
            }
            if(list.get(i) < smallest) {
                smallest = list.get(i);
            }
        }

        System.out.println("Largest : " + largest);
        System.out.println("Smallest : " + smallest);
        sc.close();
    }
}
