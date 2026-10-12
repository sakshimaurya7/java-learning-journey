package Day_27;
import java.util.Queue;
import java.util.LinkedList;

//use of contains() and remove()
public class Program4 {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        list.offer(10);
        list.offer(20);
        list.offer(30);
        list.offer(40);
        list.offer(50);
        System.out.println("Queue : " + list);
        System.out.println("Contains 30 : " + list.contains(30));
        System.out.println("Contains 100 : " + list.contains(100));
        System.out.println("Remove 30 : " + list.remove(30));
        System.out.println("Queue after removing 30 : " + list);
    }
}
