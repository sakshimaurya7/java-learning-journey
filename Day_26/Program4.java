package Day_26;
import java.util.TreeMap;

//remove() and size() in TreeMap
public class Program4 {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(101, "Rohan");
        students.put(102, "Aman");
        students.put(103, "Simran");
        System.out.println("TreeMap : " + students);
        System.out.println();
        students.remove(102);
        System.out.println("Removed Student : Aman ");
        System.out.println("Size after removal : " + students.size());
        System.out.println("Updated TreeMap : " + students);
    }
}
