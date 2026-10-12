package Day_27;
import java.util.Queue;
import java.util.LinkedList;

//Find the largest and the smallest elements in a Queue
public class Program9 {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        list.offer(45);
        list.offer(12);
        list.offer(78);
        list.offer(23);
        list.offer(9);
        list.offer(56);
        System.out.println("Queue : " + list);

        int largest = list.peek();
        int smallest = list.peek();
        for (Integer element : list) {
            if(element > largest) {
                largest = element;
            }
            if(element < smallest) {
                smallest = element;
            }
        }

        System.out.println("Largest element : " + largest);
        System.out.println("Smallest element : " + smallest);

    }
}
