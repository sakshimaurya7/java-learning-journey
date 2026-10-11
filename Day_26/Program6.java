package Day_26;
import java.util.TreeMap;

//values() in TreeMap
public class Program6 {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(101, "Rohan");
        students.put(102, "Aman");
        students.put(103, "Simran");
        System.out.println("Use of values() : ");
        System.out.println(students.values());
    }
}

