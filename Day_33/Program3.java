package Day_33;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class Program3 {
    public static void main(String[] args) {
        HashMap<String, Integer> std = new HashMap<>();
        std.put("Rohan", 85);
        std.put("Aman", 92);
        std.put("Simran", 78);
        std.put("Neha", 95);
        std.put("Karan", 88);

        System.out.println("Original Student Marks : ");
        System.out.println(std);

        System.out.println();
        System.out.println("Students Sorted by Name : ");

        Comparator<Map.Entry<String, Integer>> comparator = Comparator.comparing(Map.Entry::getKey);
        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(std.entrySet());
        Collections.sort(entries, comparator);
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }    
}
