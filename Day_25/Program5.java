package Day_25;
import java.util.HashMap;

//Find the Lowest Marks
public class Program5 {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Aman", 85);
        marks.put("Riya" , 95);
        marks.put("Kirat", 90);
        marks.put("Neha", 88);
        marks.put("Simran", 92);
        System.out.println("Student records : " + marks);
        System.out.println();
        String student = "";
        int lowest = Integer.MAX_VALUE;
        for(String name : marks.keySet()) {
            int score = marks.get(name);
            if(lowest > score) {
                lowest = score;
                student = name;
            }

        }

        System.out.println("Student with Lowest marks : " + student);
        System.out.println("Lowest marks : " + lowest);
    }
}

