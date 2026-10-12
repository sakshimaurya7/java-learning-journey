package Day_28;
import java.util.Deque;
import java.util.ArrayDeque;

//use of offerFirst() and offerLast()
public class Program2 {
    public static void main(String[] args) {
        Deque<Integer> list = new ArrayDeque<>();
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        System.out.println("Deque : " + list);
        System.out.println("Offer 10 at front : " + list.offerFirst(10));
        System.out.println("Offer 50 at rear : " + list.offerLast(50));
        System.out.println("Final Deque : " + list);
    }
}
