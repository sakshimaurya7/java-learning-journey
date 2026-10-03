package Day_22;
import java.util.LinkedList;

//Basic LinkedList operations
public class Program1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println();
        System.out.println("LinkedList : " + list);
        System.out.println();
        System.out.println("Element at index 2 : " + list.get(2));
        System.out.println();
        list.add(2, 25);
        System.out.println("After adding 25 : " + list);
        System.out.println();
        list.remove(3);
        System.out.println("After removing index 3 : " + list);
        System.out.println();
        System.out.println("Size : " + list.size());
    }
}
