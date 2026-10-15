package Day_30;
import java.util.HashMap;
import java.util.Map;

//Remove a Product by ID
public class Program9 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> product = new HashMap<>();
        product.put(101, 500);
        product.put(102, 300);
        product.put(103, 700);
        product.put(104, 900);
        product.put(105, 600);

        if(product.containsKey(102)) {
            product.remove(102);
            System.out.println("Products after removind ID 102 : ");
            for(Map.Entry<Integer, Integer> entry : product.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
        else {
            System.out.println("Product not found in the HashMap!");
        }
    }
}
