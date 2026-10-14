package Day_29;
import java.util.PriorityQueue;

//Find the Second Smallest Element
public class Program9 {
    public static void main(String[] args) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        list.offer(15);
        list.offer(5);
        list.offer(25);
        list.offer(10);
        list.offer(20);
        System.out.println("Priority Queue : " + list);
        int smallest = list.poll();
        int secondSmallest = list.peek();
        System.out.println("Smallest element : " + smallest);
        System.out.println("Second smallest element : " + secondSmallest);
    }
}
