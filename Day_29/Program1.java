package Day_29;
import java.util.PriorityQueue;

//Create and process a PriorityQueue
public class Program1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        list.offer(30);
        list.offer(10);
        list.offer(20);
        System.out.println("Smallest element(head) : " + list.peek());
        System.out.println();
        System.out.println("Elements removed by priority : ");
        while(!list.isEmpty()) {
            System.out.println(list.poll());
        }
    }
}
