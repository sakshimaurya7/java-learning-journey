package Day_29;
import java.util.PriorityQueue;

//Count Even and Odd Numbers
public class Program7 {
    public static void main(String[] args) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        list.offer(12);
        list.offer(7);
        list.offer(20);
        list.offer(15);
        list.offer(8);
        list.offer(3);
        System.out.println("Priority Queue : " + list);
        int countEven = 0;
        int countOdd = 0;
        while(!list.isEmpty()) {
            int element = list.poll();
            if(element % 2 == 0) {
                countEven++;
            }
            else {
                countOdd++;
            }
        }

        System.out.println("Even numbers count : " + countEven);
        System.out.println("Odd numbers count : " + countOdd);
    }
}
