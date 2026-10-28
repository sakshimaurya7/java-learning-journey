package Day_32;
import java.util.HashMap;
import java.util.Map;

//Student Marks Management
public class Program10 {
    public static void main(String[] args) {
        HashMap<String, Integer> std = new HashMap<>();
        std.put("Aman", 85);
        std.put("Simran", 92);
        std.put("Rohan", 78);
        std.put("Neha", 95);
        std.put("Karan", 88);
        System.out.println("Student Records : ");
        int sum = 0;
        int largest = 0;
        String name = "";

        for(Map.Entry<String, Integer> entry : std.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            sum += entry.getValue();
            if(largest < entry.getValue()){
                largest = entry.getValue();
                name = entry.getKey();
            }
        }

        double average = (double) sum / std.size();
        System.out.println();
        System.out.println("Student with highest marks : " + name + " - " + largest );
        System.out.println("Average marks : " + average);
        System.out.println("Simran's Marks : " + std.get("Simran"));

        System.out.println();
        System.out.println("After removing Rohan : ");
        std.remove("Rohan");
        System.out.println(std);
    }
}
