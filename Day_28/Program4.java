package Day_28;
import java.util.Deque;
import java.util.ArrayDeque;

//Use of peekFirst() and peekLast()
public class Program4 {
    public static void main(String[] args) {
        Deque<Integer> list = new ArrayDeque<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        System.out.println("Deque : " + list);
        System.out.println("First element : " + list.peekFirst());
        System.out.println("Last element : " + list.peekLast());
        System.out.println("Deque after peeking : " + list);
    }
}
