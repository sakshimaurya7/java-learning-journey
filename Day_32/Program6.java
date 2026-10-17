package Day_32;
import java.util.ArrayList;

//Find the common elements in two ArrayLists
public class Program6 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        System.out.println("List 1 : ");
        System.out.println(list1);

        System.out.println();
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list2.add(70);
        System.out.println("List 2 : ");
        System.out.println(list2);

        System.out.println();
        ArrayList<Integer> list = new ArrayList<>(list1);
        list.retainAll(list2);
        System.out.println("Common elements : ");
        System.out.println(list);
    }
}
