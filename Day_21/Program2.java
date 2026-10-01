package Day_21;
import java.util.ArrayList;

public class Program2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);

        //Check whether the list conatins specific elements 30 and 100 or not using.
        //list.contains(element) method
        System.out.println(numbers.contains(30));
        System.out.println(numbers.contains(100));

        //Iterate through the list using for loop and print all the elements of the list
        for(int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println(numbers.size());
    }    
}
