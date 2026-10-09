package Day_24;
import java.util.TreeSet;

//Basic TreeSet Operations
public class Program1 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(10); 
        numbers.add(30); 
        numbers.add(20); 
        numbers.add(40);
        numbers.add(30); 
        System.out.println("TreeSet : " + numbers);
        System.out.println("Size : " + numbers.size());
        System.out.println("First element : " + numbers.first());
        System.out.println("Last element : " + numbers.last());
        if(numbers.contains(20)) {
            System.out.println("20 is present in the TreeSet.");
        }
        else {
            System.out.println("20 is not present in the TreeSet.");
        }
        numbers.remove(30);
        System.out.println("After removing 30 : " + numbers);
    }
}
