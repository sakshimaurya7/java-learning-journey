package Day_34;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Collections;
import java.util.Map;

//Sort a HashMap by values and Display top 3 products
public class Program6 {
    public static void main(String[] args) {
        HashMap <String, Integer> productMap = new HashMap<>();
        productMap.put("Laptop", 500);
        productMap.put("Mobile", 800);
        productMap.put("Keyboard", 300);
        productMap.put("Monitor", 600);
        productMap.put("Mouse", 200);
        productMap.put("Printer", 400);

        ArrayList<Map.Entry<String, Integer>> productList = new ArrayList<>(productMap.entrySet());
        Collections.sort(productList, Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("Produts Sorted by Sales : ");
        for(Map.Entry<String, Integer> entry : productList) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println();
        System.out.println("Top 3 Best Selling Products : ");
        for(int i = 0; i < Math.min(3, productList.size()); i++) {
            System.out.println(productList.get(i).getKey() + " : " + productList.get(i).getValue());
        }
    }
}
