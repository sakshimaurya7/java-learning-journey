package Day_31;
import java.util.HashSet;
import java.util.TreeSet;

//Sort Elements using TreeSet
public class Program3 {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        list.add(50);
        list.add(10);
        list.add(40);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(50);
        System.out.println("Original HashSet : ");
        System.out.println(list);

        System.out.println();
        TreeSet<Integer> sortedList = new TreeSet<>();
        sortedList.addAll(list);
        System.out.println("Sorted TreeSet : ");
        System.out.println(sortedList);
    }
}
