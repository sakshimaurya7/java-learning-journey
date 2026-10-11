package Day_26;
import java.util.TreeMap;

//Create and display a TreeMap
public class Program1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(105, "Priya");
        students.put(102, "Aman");
        students.put(104, "Neha");
        students.put(101, "Rohan");
        students.put(103, "Simran");
        System.out.println(students);
    }
}
