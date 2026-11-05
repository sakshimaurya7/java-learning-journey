package Day_33;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Sort a HashMap by Values and Find the Top 3 Products
public class Program5 {
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
        System.out.println("Top 3 Products : ");
        List<Map.Entry<String, Integer>> top3 = entries.subList(0, 3);
        for(Map.Entry<String, Integer> entry : top3) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
