package Day_34;
import java.util.HashMap;
import java.util.Map;

//Merge two HashMaps
public class Program4 {
    public static void main(String[] args) {
        HashMap<String, Integer> prod = new HashMap<>();
        prod.put("Laptop", 5);
        prod.put("Mouse", 10);
        prod.put("Keyboard", 7);
        prod.put("Monitor", 4);
        
        HashMap<String, Integer> prod2 = new HashMap<>();
        prod2.put("Mouse", 5);
        prod2.put("Keyboard", 3);
        prod2.put("Printer", 6);
        prod2.put("Monitor", 2);

        for(String key : prod2.keySet()) {
            prod.merge(key, prod2.get(key), Integer::sum);
        }
        System.out.println("Merged Product Inventory : ");
        for(Map.Entry<String, Integer> entry : prod.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
