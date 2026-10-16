package Day_31;
import java.util.HashSet;

//Remove Even Numbers from a HashSet
public class Program8 {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        list.add(35);
        list.add(40);
        list.add(45);
        System.out.println("Original HashSet : ");
        System.out.println(list);

        System.out.println();
        list.removeIf(value -> value % 2 == 0);
        System.out.println("After removing even numbers : ");
        System.out.println(list);
    }
}
