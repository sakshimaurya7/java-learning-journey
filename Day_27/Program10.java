package Day_27;
import java.util.Queue;
import java.util.LinkedList;

//Queue Mini Project : Student Queue Management
public class Program10 {
    public static void main(String[] args) {
        Queue<Integer> stdId = new LinkedList<>();
        stdId.offer(101);
        stdId.offer(102);
        stdId.offer(103);
        stdId.offer(104);
        System.out.println("Student Queue : " + stdId);
        System.out.println("Next student : " + stdId.peek());
        System.out.println("Is student 103 waiting? " + stdId.contains(103));
        System.out.println("Serving Student : " + stdId.poll());
        System.out.println("Queue after serving : " + stdId);
        System.out.println("Students waiting : " + stdId.size());
        System.out.println("Is queue empty? " + stdId.isEmpty());

    }
}
