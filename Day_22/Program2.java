package Day_22;
import java.util.LinkedList;

//First and Last operations in LinkedList
public class Program2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.addFirst(10);
        list.addLast(50);
        System.out.println("LinkedList : "  +list);
        System.out.println();
        System.out.println("First Element : " + list.getFirst());
        System.out.println("Last Element : " + list.getLast());
        System.out.println();
        list.removeFirst();
        System.out.println("After removing first : " + list);
        list.removeLast();
        System.out.println("After removing last : " + list);
    }
}
