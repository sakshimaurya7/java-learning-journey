package Day_28;
import java.util.Deque;
import java.util.ArrayDeque;

//Use a Deque as a Stack
public class Program8 {
    public static void main(String[] args) {
        Deque<Integer> list = new ArrayDeque<>();
        list.push(10);
        list.push(20);
        list.push(30);
        System.out.println("Stack : " + list);
        System.out.println("Top element : " + list.peek());
        System.out.println("Popped element : " + list.pop());
        System.out.println("Stack after pop : " + list);
    }
}
