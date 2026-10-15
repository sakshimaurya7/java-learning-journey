package Day_30;
import java.util.HashMap;

//Search for a Product by ID
public class Program8 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> product = new HashMap<>();
        product.put(101, 500);
        product.put(102, 300);
        product.put(103, 700);
        product.put(104, 900);
        product.put(105, 600);

        if(product.containsKey(103)) {
            System.out.println("Product Found!");
            System.out.println("Product ID : 103");
            System.out.println("Price : " + product.get(103));
        }
        else {
            System.out.println("Product not found!");
        }
    }
}
