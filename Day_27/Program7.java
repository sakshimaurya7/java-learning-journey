package Day_27;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

//Reverse a Queue
public class Program7 {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        list.offer(10);
        list.offer(20);
        list.offer(30);
        list.offer(40);
        list.offer(50);
        System.out.println("Original Queue : " + list);

        Stack<Integer> list1 = new Stack<>();
        while(!list.isEmpty()) {
            int num = list.poll();
            list1.push(num);
        }

        while(!list1.isEmpty()) {
            int element = list1.pop();
            list.offer(element);
        }

        System.out.println("Reversed Queue : " + list);

    }
}
