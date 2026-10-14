package Day_29;
import java.util.PriorityQueue;

//Student Priority Management
public class Program10 {
    public static void main(String[] args) {
        PriorityQueue<Integer> std = new PriorityQueue<>();
        std.offer(3);
        std.offer(1);
        std.offer(4);
        std.offer(2);
        std.offer(5);
        System.out.println("Students processed by priority : ");
        while(!std.isEmpty()) {
            int student = std.poll();
            System.out.println("Priority " + student);
        }
    }
}
