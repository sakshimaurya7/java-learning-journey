package Day_28;
import java.util.Deque;
import java.util.ArrayDeque;

//Create a Deque and Add elements
public class Program1 {
    public static void main(String[] args) {
        Deque<Integer> list = new ArrayDeque<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println("Deque : " + list);
        list.addFirst(5);
        System.out.println("Deque after adding 5 at front : " + list);
        list.addLast(40);
        list.addLast(50);
        System.out.println("Deque after adding 40 & 50 at the rear : " + list);
    }
}
