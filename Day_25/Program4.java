package Day_25;
import java.util.HashMap;

//Find the student with the highest marks
public class Program4 {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Aman", 85);
        marks.put("Riya" , 95);
        marks.put("Kirat", 90);
        marks.put("Neha", 88);
        marks.put("Simran", 92);
        System.out.println("Student records : " + marks);
        System.out.println();
        String topper = "";
        int highest = Integer.MIN_VALUE;
        for(String name : marks.keySet()) {
            int score = marks.get(name);
            if(highest < score) {
                highest = score;
                topper = name;
            }

        }

        System.out.println("Topper : " + topper);
        System.out.println("Highest marks : " + highest);
    }
}
