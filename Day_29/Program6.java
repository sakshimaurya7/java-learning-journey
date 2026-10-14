package Day_29;
import java.util.PriorityQueue;
import java.util.Collections;

//Convert a PriorityQueue to a Max-Priority Queue
public class Program6 {
    public static void main(String[] args) {
        PriorityQueue<Integer> list = new PriorityQueue<>(Collections.reverseOrder());
        list.offer(30);
        list.offer(10);
        list.offer(50);
        list.offer(20);
        list.offer(40);
        System.out.println("Elements in descending Priority order : ");
        while(!list.isEmpty()) {
            System.out.println(list.poll());
        }
    }
}
