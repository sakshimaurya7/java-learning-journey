package Day_26;
import java.util.TreeMap;

//Mini Project
//Student Records
public class Program10 {
    public static void main(String[] args) {
        TreeMap<Integer, String> stds = new TreeMap<>();
        stds.put(101, "Rohan");
        stds.put(102, "Neha");
        stds.put(103, "Simran");
        System.out.println("Student Records : " + stds);
        System.out.println("Contains key 102 : " + stds.containsKey(102));
        System.out.println("Keys : " + stds.keySet());
        System.out.println("Values : " + stds.values());
        System.out.println("Removed Student : " + stds.get(102));
        stds.remove(102);
        System.out.println("Size after removal : " + stds.size());
        System.out.println("First Key : " + stds.firstKey());
        System.out.println("Last Key : " + stds.lastKey());
        System.out.println("Descending Map : " + stds.descendingMap());
    }
}
