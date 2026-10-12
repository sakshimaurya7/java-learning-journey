package Day_27;
import java.util.Queue;
import java.util.LinkedList;

//count even and odd numbers in a Queue
public class Program8 {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        list.offer(10);
        list.offer(15);
        list.offer(20);
        list.offer(25);
        list.offer(30);
        list.offer(35);
        System.out.println("Queue : " + list);
        int countEven = 0;
        int countOdd = 0;
        for (Integer element : list) {
            if(element % 2 == 0) {
                countEven++;
            }
            else {
                countOdd++;
            }
        }

        System.out.println("Even numbers : " + countEven);
        System.out.println("Odd numbers : " + countOdd);
    }
}
