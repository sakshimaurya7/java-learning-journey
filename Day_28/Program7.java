package Day_28;
import java.util.Deque;
import java.util.ArrayDeque;

//Use of removeFirstOccurrence() and removeLastOccurrence()
public class Program7 {
    public static void main(String[] args) {
        Deque<Integer> list = new ArrayDeque<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(20);
        list.addLast(40);
        list.addLast(20);
        list.addLast(50);
        System.out.println("Deque : " + list);
        System.out.println("Remove first occurrence of 20 : " + list.removeFirstOccurrence(20));
        System.out.println("Deque after first removal : " + list);
        System.out.println("Remove last occurrence of 20 : " + list.removeLastOccurrence(20));
        System.out.println("Deque after last removal : " + list);
    }
}
