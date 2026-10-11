package Day_26;
import java.util.TreeMap;

//use of descendingMap()
public class Program9 {
    public static void main(String[] args) {
        TreeMap<Integer, String> stds = new TreeMap<>();
        stds.put(101, "Rohan");
        stds.put(102, "Neha");
        stds.put(103, "Simran");
        System.out.println("Descending Map : " + stds.descendingMap());
    }
}
