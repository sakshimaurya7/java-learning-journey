package Day_29;
import java.util.PriorityQueue;

//Search and Remove an Element
public class Program3 {
    public static void main(String[] args) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        list.offer(50);
        list.offer(20);
        list.offer(40);
        list.offer(10);
        list.offer(30);
        System.out.println("Priority Queue : " + list);
        System.out.println("Contains 40 : " + list.contains(40));
        System.out.println("Contains 100 : " + list.contains(100));
        System.out.println("Removed 20 : " + list.remove(20));
        System.out.println("Updated size : " + list.size());
        System.out.println();
        System.out.println("Remaining elements : ");
        while(!list.isEmpty()) {
            System.out.println(list.poll());
        }
    }
}
