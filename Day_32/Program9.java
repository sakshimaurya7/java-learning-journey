package Day_32;
import java.util.HashSet;

//Find the difference between two sets
public class Program9 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);
        System.out.println("Set 1 : ");
        System.out.println(set1);

        System.out.println();
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(30);
        set2.add(40);
        set2.add(60);
        System.out.println("Set 2 : ");
        System.out.println(set2);

        System.out.println();
        set1.removeAll(set2);
        System.out.println("Difference (Set 1 - Set 2) : ");
        System.out.println(set1);
    }
}
