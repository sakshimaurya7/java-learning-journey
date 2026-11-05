package Day_33;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;


public class Program4 {
    public static void main(String[] args) {
        HashMap <String, Integer> std = new HashMap<>();
        std.put("Aman", 85);
        std.put("Simran", 92);
        std.put("Rohan", 78);
        std.put("Neha", 95);
        std.put("Karan", 88);

        System.out.println("Students Sorted by Marks (Highest to Lowest) : ");
        ArrayList <Map.Entry<String, Integer>> entries = new ArrayList<>(std.entrySet());
        Comparator<Map.Entry<String, Integer>> comparator = Comparator.comparing(Map.Entry::getValue);
        Collections.sort(entries, comparator.reversed());
        for(Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }    
}
