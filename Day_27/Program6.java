package Day_27;
import java.util.Queue;
import java.util.LinkedList;

//Use of element() and peek()
public class Program6 {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        list.offer(10);
        list.offer(20);
        list.offer(30);
        list.offer(40);
        list.offer(50);
        System.out.println("Queue : " + list);
        System.out.println("Front using peek() : " + list.peek());
        System.out.println("Front using element() : " + list.element());
        System.out.println("Queue after checking front : " + list);
    }
}
