package Day_30;
import java.util.HashMap;
import java.util.Map;

//Find Duplicate Elements
public class Program2 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 20, 40, 10, 50};
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int i : array) {
            list.put(i, list.getOrDefault(i, 0) + 1);
        }

        System.out.println("Duplicate elements : ");
        for (Map.Entry<Integer, Integer> entry : list.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
