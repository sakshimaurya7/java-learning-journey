package Day_28;
import java.util.Deque;
import java.util.ArrayDeque;

//Use of removeFirst() and removeLast()
public class Program3 {
    public static void main(String[] args) {
        Deque<Integer> list = new ArrayDeque<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        System.out.println("Deque : " + list);
        System.out.println("Removed first element : " + list.removeFirst());
        System.out.println("Removed last element : " + list.removeLast());
        System.out.println("Deque after removals : " + list);
    }
}
