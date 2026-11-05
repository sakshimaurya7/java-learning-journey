package Day_33;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

//Sort Employees by Salary in Descending Order
public class Program9 {
    public static void main(String[] args) {
        HashMap<String, Integer> std = new HashMap<>();
        std.put("Rohan", 85);
        std.put("Aman", 92);
        std.put("Simran", 76);
        std.put("Neha", 88);
        std.put("Karan", 90);

        System.out.println("Students Sorted by Name (Z-A): ");
        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(std.entrySet());
        Comparator<Map.Entry<String, Integer>> comparator = Comparator.comparing(Map.Entry::getKey);
        Collections.sort(entries, comparator.reversed());
        for(Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

