package Day_30;
import java.util.HashMap;
import java.util.Map;

//Find the Element with the Highest Frequency
public class Program3 {
    public static void main(String[] args) {
        int[] array = {10, 20, 10, 30, 20, 10, 40, 20, 20};
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int i : array) {
            list.put(i, list.getOrDefault(i, 0) + 1);
        }

        int highFrequency = 0;
        int numOfHighFreq = 0;
        for (Map.Entry<Integer, Integer> entry : list.entrySet()) {
            if(highFrequency < entry.getValue()) {
                highFrequency = entry.getValue();
                numOfHighFreq = entry.getKey();
            }
        }

        System.out.println("Element with highest Frequency : " + numOfHighFreq );
        System.out.println("Frequency : " + highFrequency);
    }
}
