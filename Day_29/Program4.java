package Day_29;
import java.util.PriorityQueue;

//Find the Largest and Smallest Elements
public class Program4 {
    public static void main(String[] args) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        list.offer(45);
        list.offer(12);
        list.offer(67);
        list.offer(23);
        list.offer(9);
        int smallest = list.peek();
        System.out.println("Smallest element : " + smallest);
        int largest = list.peek();
        while(!list.isEmpty()) {
            largest = list.poll();
        }

        System.out.println("Largest element : " + largest);
    }
}
