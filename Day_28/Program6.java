package Day_28;
import java.util.Deque;
import java.util.ArrayDeque;

//USe of size(), isEmpty() and contains()
public class Program6 {
    public static void main(String[] args) {
        Deque<Integer> list = new ArrayDeque<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        System.out.println("Deque : " + list);
        System.out.println("Size : " + list.size());
        System.out.println("Is Deque empty : " + list.isEmpty());
        System.out.println("Contains 30 : " + list.contains(30));
        System.out.println("Contains 100 : " + list.contains(100));
    }
}
