package Day_31;
import java.util.HashSet;

//Check whether one set is a subset of another
public class Program7 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(10);
        set2.add(20);
        set2.add(30);
        set2.add(40);
        set2.add(50);

        HashSet<Integer> set3 = new HashSet<>();
        set3.add(10);
        set3.add(20);
        set3.add(60);

        System.out.println("Set 1 : " + set1);
        System.out.println("Set 2 : " + set2);
        System.out.println("Set 3 : " + set3);
        System.out.println();
        System.out.println("Is set1 a subset of set2? " + set2.containsAll(set1));
        System.out.println("Is set3 a subset of set2? " + set2.containsAll(set3));

    }
}
