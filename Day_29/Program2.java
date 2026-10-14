package Day_29;
import java.util.PriorityQueue;

//Use of peek() and poll()
public class Program2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        list.offer(40);
        list.offer(15);
        list.offer(25);
        list.offer(10);
        System.out.println("Head element : " + list.peek());
        System.out.println("Size before poll : " + list.size());
        System.out.println("Removed element : " + list.poll());
        System.out.println("Head after poll : " + list.peek());
        System.out.println("Size after poll : " + list.size());
    }
}
