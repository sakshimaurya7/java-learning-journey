package Day_25;
import java.util.HashMap;
import java.util.Map;

//Display all Students and their marks
public class Program8 {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Aman", 85);
        marks.put("Riya", 35);
        marks.put("Kirat", 60);
        marks.put("Neha", 28);
        marks.put("Simram", 72);

        for(Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println("Student : " + entry.getKey() + " , Marks : " + entry.getValue());
        }

        System.out.println();
        System.out.println("Total students : " + marks.size());
    }
}
