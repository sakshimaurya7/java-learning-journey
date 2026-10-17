package Day_32;
import java.util.HashMap;
import java.util.Map;

//Find the Most frequent element
public class Program3 {
    public static void main(String[] args) {
        int[] array = {5, 10, 5, 20, 10, 5, 30, 10, 5};
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int i : array) {
            list.put(i, list.getOrDefault(i, 0) + 1);
        }

        int maxFreq = 0;
        int mostFreqEle = 0;
        for(Map.Entry<Integer, Integer> entry : list.entrySet()) {
            if(maxFreq < entry.getValue()) {
                maxFreq = entry.getValue();
                mostFreqEle = entry.getKey();
            }
        }

        System.out.println("Most Frequent Element : " + mostFreqEle);
        System.out.println("Frequency : " + maxFreq);
    }
}
