package Day_27;
import java.util.Queue;
import java.util.LinkedList;

//use of poll() and peek()
public class Program2 {
    public static void main(String[] args) {
        Queue<Integer> number = new LinkedList<>();
        number.offer(10);
        number.offer(20);
        number.offer(30);
        number.offer(40);
        number.offer(50);
        System.out.println("Queue : " + number);
        System.out.println("Front element : " + number.peek());
        System.out.println("Removed element : " + number.poll());
        System.out.println("Queue after poll() : " + number);
    }
}
