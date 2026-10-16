package Day_31;
import java.util.HashSet;
import java.util.ArrayList;

//Remove Duplicate Elements from an Array
public class Program1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 40, 20, 50, 30};

        HashSet<Integer> list = new HashSet<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (Integer integer : numbers) {
            list.add(integer);
        }

        System.out.println("Unique elements : ");
        for (Integer integer : list) {
            System.out.println(integer);
            list1.add(integer);
        }
        System.out.println();
        System.out.println("ArrayList :");
        System.out.println(list1);
    }    
}
