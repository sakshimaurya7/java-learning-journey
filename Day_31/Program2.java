package Day_31;
import java.util.HashSet;

//Find the common Elements between two sets
public class Program2 {
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
        set2.add(50);
        set2.add(60);
        set2.add(70);
        System.out.println("Set 1 : "  + set1);
        System.out.println("Set 2 : " + set2);
        System.out.println();
        System.out.println("Common Elements : ");
        set1.retainAll(set2);
        System.out.println(set1);
    }
}
