package Day_30;
import java.util.HashMap;
import java.util.Map;

//Find the Sum of All Values in a HashMap
public class Program6 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> product = new HashMap<>();
        product.put(101, 500);
        product.put(102, 300);
        product.put(103, 700);
        product.put(104, 200);
        int sum = 0;
        for(Map.Entry<Integer, Integer> entry : product.entrySet()) {
            sum += entry.getValue();
        }

        System.out.println("Total price : " + sum);
    }
}
