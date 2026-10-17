package Day_32;
import java.util.HashMap;
import java.util.Map;

//Count the Frequency of each element
public class Program2 {
    public static void main(String[] args) {
        int[] list = {10, 20, 10, 30, 20, 10, 40, 30, 20};
        HashMap<Integer, Integer> freqList = new HashMap<>();

        for (int i : list) {
            freqList.put(i, freqList.getOrDefault(i, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : freqList.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println();
        System.out.println("Frequency of 10 : " + freqList.get(10));

    }
}
