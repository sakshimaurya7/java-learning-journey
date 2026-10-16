package Day_31;
import java.util.HashSet;

//Find the Difference between two sets
public class Program6 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(30);
        set2.add(40);
        set2.add(60);

        System.out.println("Set 1 : " +set1);
        System.out.println("Set 2 : " + set2);

        System.out.println();
        HashSet<Integer> difference = new HashSet<>();
        difference.addAll(set1);
        difference.removeAll(set2);
        System.out.println("Difference : " + difference);
    }
}
