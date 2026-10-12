package Day_27;
import java.util.Queue;
import java.util.LinkedList;

//use of add() and offer()
public class Program5 {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        list.offer(10);
        list.offer(20);
        list.offer(30);
        System.out.println("Queue : " + list);
        System.out.println("Offer 40 : " + list.offer(40));
        System.out.println("Add 50 : " + list.add(50));
        System.out.println("Final Queue : " + list);
    }
}
