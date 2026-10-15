package Day_30;
import java.util.HashMap;
import java.util.Map;

//Find the Product with the Highest Price
public class Program7 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> product = new HashMap<>();
        product.put(101, 500);
        product.put(102, 300);
        product.put(103, 700);
        product.put(104, 900);
        product.put(105, 600);
        int highPricePd = 0;
        int productId = 0;
        for(Map.Entry<Integer, Integer> entry : product.entrySet()) {
            if(highPricePd < entry.getValue()) {
                highPricePd = entry.getValue();
                productId = entry.getKey();
            }
        }

        System.out.println("Product ID with highest price : " + productId);
        System.out.println("Highest Price : " + highPricePd);
    }
}
