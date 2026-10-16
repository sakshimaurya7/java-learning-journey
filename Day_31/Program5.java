package Day_31;
import java.util.HashSet;

//Find the Union of Two Sets
public class Program5 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(30);
        set2.add(40);
        set2.add(50);
        set2.add(60);
        System.out.println("Set 1 : " + set1);
        System.out.println("Set 2 : " + set2);

        System.out.println();
        System.out.println("Union : ");
        HashSet<Integer> union = new HashSet<>();
        union.addAll(set1);
        union.addAll(set2);
        System.out.println(union);
        System.out.println();
        System.out.println("Total elements : " + union.size());
    }
}
