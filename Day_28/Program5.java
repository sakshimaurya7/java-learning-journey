package Day_28;
import java.util.Deque;
import java.util.ArrayDeque;

//Use of getFirst() and getLast()
public class Program5 {
    public static void main(String[] args) {
        Deque<Integer> list = new ArrayDeque<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        System.out.println("Deque : " + list);
        System.out.println("First element : " + list.getFirst());
        System.out.println("Last element : " + list.getLast());
        System.out.println("Deque after getting elements : " + list);
    }
}
