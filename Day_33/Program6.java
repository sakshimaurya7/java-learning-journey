package Day_33;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

//Find the Second Highest Selling Product
public class Program6 {
    public static void main(String[] args) {
        HashMap<String, Integer> prod = new HashMap<>();
        prod.put("Laptop", 50000);
        prod.put("Mouse", 5000);
        prod.put("Keyboard", 8000);
        prod.put("Monitor", 30000);
        prod.put("Headphones", 12000);

        System.out.println("Products Sorted by Sales : ");
        System.out.println();
        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(prod.entrySet());
        Comparator<Map.Entry<String, Integer>> comparator = Comparator.comparing(Map.Entry::getValue);
        Collections.sort(entries, comparator.reversed());
        for(Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println();
        System.out.println("Second Highest Selling Product : ");
        System.out.println(entries.get(1).getKey() + " : " + entries.get(1).getValue());
    }
}
