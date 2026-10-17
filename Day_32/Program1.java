package Day_32;
import java.util.ArrayList;
import java.util.TreeSet;

//Remove Duplicates and Sort an ArrayList
public class Program1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(20);
        list.add(60);
        System.out.println("Original ArrayList : ");
        System.out.println(list);

        System.out.println();
        TreeSet<Integer> sortedList = new TreeSet<>();
        sortedList.addAll(list);
        System.out.println("Usinque sorted elements : ");
        System.out.println(sortedList);

        System.out.println();
        System.out.println("Total unique elements : " + sortedList.size());
    }    
}
