package Day_32;
import java.util.ArrayList;
import java.util.HashSet;

//Find the Union of two lists
public class Program8 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);

        System.out.println("List 1 : ");
        System.out.println(list1);
        System.out.println();
        System.out.println("List 2 : ");
        System.out.println(list2);

        System.out.println();
        HashSet<Integer> list = new HashSet<>();
        list.addAll(list1);
        list.addAll(list2);
        System.out.println("Union of both lists : ");
        System.out.println(list);
    }
}
