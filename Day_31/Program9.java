package Day_31;
import java.util.HashSet;
import java.util.Collections;

//Find the Largest and Smallest Elements in HashSet
public class Program9 {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        list.add(45);
        list.add(12);
        list.add(78);
        list.add(23);
        list.add(56);
        list.add(9);
        list.add(34);
        System.out.println("HashSet : ");
        System.out.println(list);

        int largest = Collections.max(list);
        int smallest = Collections.min(list);
        System.out.println();
        System.out.println("Largest element : " + largest);
        System.out.println("Smallest element : " + smallest);
    }
}
