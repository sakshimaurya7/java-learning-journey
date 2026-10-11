package Day_26;
import java.util.TreeMap;

//containsKey() and containsValue()
public class Program3 {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(101, "Rohan");
        students.put(102, "Aman");        
        students.put(103, "Simran");
        System.out.println("Contains key 102 : " + students.containsKey(102));
        System.out.println("Contains key 105 : " + students.containsKey(105));
        System.out.println("Contains value Simran : " + students.containsValue("Simran"));
        System.out.println("Contains value Rahul : " + students.containsValue("Rahul"));
    }
}
