package Day_33;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

//Sort HashMap by marks in Descending Order
public class Program10 {
    public static void main(String[] args) {
        HashMap<String, Integer> std = new HashMap<>();
        std.put("Aman", 90);
        std.put("Rahul", 85);
        std.put("Simran", 90);
        std.put("Neha", 78);
        std.put("Karan", 85);

        System.out.println("Students Sorted by Marks : ");
        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(std.entrySet());
        Comparator<Map.Entry<String, Integer>> comparator = Comparator.comparing(Map.Entry::getValue);
        comparator = Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed().thenComparing(Map.Entry::getKey);
        Collections.sort(entries, comparator);
        for(Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}