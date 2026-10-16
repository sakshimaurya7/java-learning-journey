package Day_31;
import java.util.ArrayList;
import java.util.HashSet;

//Convert ArrayList to HashSet
public class Program4 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(20);
        array.add(10);
        array.add(30);
        array.add(20);
        array.add(40);
        array.add(50);
        array.add(30);
        System.out.println("Original ArrayList : ");
        System.out.println(array);

        System.out.println();
        HashSet<Integer> listUniq = new HashSet<>();
        listUniq.addAll(array);
        System.out.println("HashSet : ");
        System.out.println(listUniq);
        System.out.println();
        System.out.println("Number of unique elements : " + listUniq.size());
    }
}
