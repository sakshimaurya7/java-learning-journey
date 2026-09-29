package Day_21;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);

        //Accessing Elements    list.get(index)
        System.out.println(numbers.get(0));

        //Changing an element     list.set(index, newValue)
        numbers.set(1, 50);
        System.out.println(numbers);

        //Removing an element    list.remove(index)
        numbers.remove(0);
        System.out.println(numbers);

        //finding the size    list.size()
        System.out.println(numbers.size());

    }
}