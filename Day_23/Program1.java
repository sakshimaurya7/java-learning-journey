package Day_23;
import java.util.HashSet;

public class Program1 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);

        System.out.println("HashSet : " + numbers);
        System.out.println("Size : " + numbers.size());

        System.out.println();
        if(numbers.contains(20)) {
            System.out.println("20 is present in the HashSet.");
        }
        else{
            System.out.println("20 is not present in the HashSet.");
        }

        System.out.println();
        numbers.remove(20);
        System.out.println("After removing 20 : " + numbers);
    }    
}
