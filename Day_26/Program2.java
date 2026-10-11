package Day_26;
import java.util.TreeMap;

//Use put() and get()
public class Program2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(101, "Aman");
        students.put(102, "Simran");
        students.put(103, "Neha");
        System.out.println("Student with roll number 102 : " + students.get(102));
        System.out.println("Student with roll number 101 : " + students.get(101));
    }
}
