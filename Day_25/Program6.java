package Day_25;
import java.util.HashMap;

//Count students who passed and failed
public class Program6 {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Aman", 85);
        marks.put("Riya", 35);
        marks.put("Kirat", 60);
        marks.put("Neha", 28);
        marks.put("Simram", 72);
        int countPass = 0;
        int countFail = 0;
        for(String name : marks.keySet()) {
            if(marks.get(name) >= 40) {
                countPass++;
            }
            else {
                countFail++;
            }
        }

        System.out.println("Students record : " + marks);
        System.out.println();
        System.out.println("Passed Students : " + countPass);
        System.out.println("Failed Students : " + countFail);
    }
}
