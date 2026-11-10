package Day_34;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

//Group Students Accoording to their marks using HashMap
public class Program3 {
    public static void main(String[] args) {
        HashMap<String, Integer> std = new HashMap<>();
        std.put("Aman", 85);
        std.put("Rahul", 90);
        std.put("Simran", 85);
        std.put("Neha", 75);
        std.put("Karan", 90);
        std.put("Priya", 75);
        std.put("Rohan", 85);

        HashMap<Integer, ArrayList<String>> groupedStudents = new HashMap<>();
        for(Map.Entry<String, Integer> entry : std.entrySet()) {
            String name = entry.getKey();
            Integer marks = entry.getValue();
            groupedStudents.putIfAbsent(marks, new ArrayList<>());
            groupedStudents.get(marks).add(name);
        }

        System.out.println("Students Grouped by Marks:");
        System.out.println();
        for(Map.Entry<Integer, ArrayList<String>> entry : groupedStudents.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println();
        System.out.println("Total Students in Each Group : ");
        System.out.println();
        for(Map.Entry<Integer, ArrayList<String>> entry : groupedStudents.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().size());
        }
    }
}
