package Day_30;
import java.util.HashMap;
import java.util.Map;

//Find the Lowest Frequency Element
public class Program4 {
    public static void main(String[] args) {
        int[] array = {10, 20, 10, 30, 20, 10, 40, 50, 50};
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int i : array) {
            list.put(i, list.getOrDefault(i, 0) + 1);
        }

        int smallFreq = Integer.MAX_VALUE;
        int numOfSmallFreq = 0;
        for (Map.Entry<Integer, Integer> entry : list.entrySet()) {
            if(smallFreq > entry.getValue()) {
                smallFreq = entry.getValue();
                numOfSmallFreq = entry.getKey();
            }
        }

        System.out.println("Element with lowest Frequency : " + numOfSmallFreq);
        System.out.println("Frequency : " + smallFreq);
    }    
}
