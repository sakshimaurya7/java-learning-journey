package Day_30;
import java.util.HashMap;
import java.util.Map;

//Student Record Management
public class Program10 {
    public static void main(String[] args) {
        HashMap<Integer, String> std = new HashMap<>();
        std.put(101, "Rohan");
        std.put(102, "Aman");
        std.put(103, "Simran");
        std.put(104, "Neha");
        for (Map.Entry<Integer, String> entry : std.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println();
        System.out.println("Searching for Student ID 103 : " );
        System.out.println("Student Name : " + std.get(103));

        System.out.println();
        std.remove(102);
        System.out.println("After removing Student Id 102 : ");
        for (Map.Entry<Integer, String> entry : std.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println();
        System.out.println("Total Students : " + std.size());
    }
}
