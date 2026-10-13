package Day_28;
import java.util.Deque;
import java.util.ArrayDeque;

//Reverse a Deque
public class Program9 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);
        deque.addLast(40);
        deque.addLast(50);
        System.out.println("Original Deque : " + deque);

        Deque<Integer> temp = new ArrayDeque<>();
        while(!deque.isEmpty()) {
            int element = deque.pollFirst();
            temp.addFirst(element);
        }

        System.out.println("Reversed Deque : " + temp);
    }
}
