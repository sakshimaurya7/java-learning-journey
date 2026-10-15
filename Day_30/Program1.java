package Day_30;
import java.util.HashMap;
import java.util.Map;

//Count the Frequency of Elements
public class Program1 {
    public static void main(String[] args) {
        int[] array = {10, 20, 10, 30, 20, 10, 40};
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int i : array) {
            list.put(i, list.getOrDefault(i, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : list.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}