package Day_26;
import java.util.TreeMap;

//entrySet() in TreeMap
public class Program7 {
    public static void main(String[] args) {
        TreeMap<Integer, String> stds = new TreeMap<>();
        stds.put(101, "Rohan");
        stds.put(102, "Neha");
        stds.put(103, "Simran");
        System.out.println("Use of entrySet() : ");
        System.out.println(stds.entrySet());
    }
}
