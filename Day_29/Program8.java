package Day_29;
import java.util.PriorityQueue;

//Find the Sum and average 
public class Program8 {
    public static void main(String[] args) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        list.offer(10);
        list.offer(20);
        list.offer(30);
        list.offer(40);
        list.offer(50);
        System.out.println("Priority Queue : " + list);
        int sum = 0;
        int count = 0;
        while(!list.isEmpty()) {
            int element = list.poll();
            sum += element;
            count++;
        }

        double average = sum / (double) count;
        System.out.println("Sum of elements : " + sum);
        System.out.println("Average of elements : " + average);
    }
}
