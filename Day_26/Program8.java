package Day_26;
import java.util.TreeMap;

//firstKey() and lastKey()
public class Program8 {
    public static void main(String[] args) {
        TreeMap<Integer, String> stds = new TreeMap<>();
        stds.put(101, "Rohan");
        stds.put(102, "Neha");
        stds.put(103, "Simran");
        System.out.println("First Key : " + stds.firstKey());
        System.out.println("Last Key : " + stds.lastKey());
    }
}
