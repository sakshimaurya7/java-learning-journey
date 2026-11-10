package Day_34;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map;

//Student Record Management System using HashMap
public class Program7 {
    public static void main(String[] args) {
        HashMap <Integer, Integer> std = new HashMap<>();
        std.put(101, 85);
        std.put(102, 92);
        std.put(103, 76);
        std.put(104, 88);
        std.put(105, 95);

        System.out.println("Student Records : ");
        System.out.println();
        for(Integer rollNo : std.keySet()) {
            System.out.println(rollNo + " : " + std.get(rollNo));
        }

        System.out.println();
        System.out.println("Marks of Roll No. 103 : " + std.get(103));
        System.out.println();
        std.put(103, 82);
        System.out.println("Updated Marks of Roll No. 103 : " + std.get(103));
        System.out.println();
        System.out.println("Does Roll No. 106 Exist? " + std.containsKey(106));
        System.out.println();
        std.remove(102);
        System.out.println("Removed Roll No. 102");
        System.out.println();

        int highestMarks = Collections.max(std.values());
        System.out.println("Highest Marks : " + highestMarks);
        int lowerMarks = Collections.min(std.values());
        System.out.println("Lowest Marks : " + lowerMarks);
        System.out.println();
        System.out.println("Final Student Records : ");
        System.out.println();
        for(Map.Entry<Integer, Integer> entry : std.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
