package Day_25;
import java.util.HashMap;

//Calculate the Average marks
public class Program7 {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Aman", 85);
        marks.put("Riya", 35);
        marks.put("Kirat", 60);
        marks.put("Neha", 28);
        marks.put("Simram", 72);

        System.out.println("Students record : " + marks);
        int total = 0;
        for(String name : marks.keySet()) {
            total += marks.get(name);
        }

        System.out.println("Total marks : " + total);
        double average = (double) total / marks.size();
        System.out.println("Average marks : " + average);
    }
}
