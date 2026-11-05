package Day_33;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

//Sort Employees by Salary in Descending Order
public class Program8 {
    public static void main(String[] args) {
        HashMap<String, Integer> emp = new HashMap<>();
        emp.put("Aman", 25000);
        emp.put("Rahul", 35000);
        emp.put("Simran", 30000);
        emp.put("Neha", 45000);
        emp.put("Karan", 28000);

        System.out.println("Employees Sorted by Salary (Highest to Lowest): ");
        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(emp.entrySet());
        Comparator<Map.Entry<String, Integer>> comparator = Comparator.comparing(Map.Entry::getValue);
        Collections.sort(entries, comparator.reversed());
        for(Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
