package Day_24;
import java.util.Iterator;
import java.util.TreeSet;

//TreeSet Traversal
public class Program8 {
    public static void main(String[] args) {
        
        java.util.TreeSet<Integer> list = new TreeSet<>();
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(40);
        list.add(20);
        System.out.println("TreeSet : " + list);
        System.out.println();
        System.out.println("Using Enhanced for loop : ");
        for(int value : list) {
            System.out.println(value);
        }

        System.out.println();
        System.out.println("Using forEach() : ");
        list.forEach(value -> System.out.println(value));

        System.out.println();
        System.out.println("Using Iterator : ");
        Iterator<Integer> iteartor = list.iterator();
        while(iteartor.hasNext()) {
            System.out.println(iteartor.next());
        }
    }
}