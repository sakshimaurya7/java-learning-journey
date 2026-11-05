package Day_33;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;

//Sort a HashMap by values
public class Program1 {
    public static void main(String[] args) {
        HashMap<String, Integer> prod = new HashMap<>();
        prod.put("Mouse", 500);
        prod.put("Keyboard", 1200);
        prod.put("Monitor", 8000);
        prod.put("Headphones", 1500);
        prod.put("Webcam", 900);
        System.out.println("Original Product Prices : ");
        System.out.println(prod);

        ArrayList <Map.Entry<String, Integer>> entries = new ArrayList<>();
        Comparator<Map.Entry<String, Integer>> comparator = Comparator.comparing(Map.Entry::getValue);

        System.out.println();
        System.out.println("Products Sorted by Price : ");
        for (Map.Entry<String, Integer> entry : prod.entrySet()) {
            entries.add(entry);
        }
        
        Collections.sort(entries, comparator);
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
