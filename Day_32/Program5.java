package Day_32;
import java.util.Iterator;
import java.util.TreeSet;

//Find the Second Largest unique element
public class Program5 {
    public static void main(String[] args) {
        int[] array = {25, 10, 40, 30, 40, 15, 50, 25};
        TreeSet<Integer> list = new TreeSet<>();
        for (Integer num : array) {
            list.add(num);
        }

        System.out.println("Unique Sorted Elements : ");
        System.out.println(list);

        System.out.println();
        Iterator<Integer> it = list.descendingIterator();
        int largest = it.next();
        int secondLargest = it.next();
        System.out.println("Second-largest unique element : " + secondLargest);
    }
}
