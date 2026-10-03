package Day_22;
import java.util.LinkedList;
import java.util.Scanner;

//Remove elements from LinkedList
public class Program4 {
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
        System.out.print("Enter number to remove : ");
        int remove = sc.nextInt();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == remove) {
                list.remove(i);
                break;
            }
        }

        System.out.println();
        System.out.println("After removing " + remove + " : " + list);
        System.out.println();
        System.out.println("Size : "  + list.size());
        sc.close();
    }
}
