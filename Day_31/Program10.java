package Day_31;
import java.util.HashMap;
import java.util.Map;

//Student Marks Management Using HashMap
public class Program10 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> std = new HashMap<>();
        std.put(101, 85);
        std.put(102, 92);
        std.put(103, 76);
        std.put(104, 88);

        for(Map.Entry<Integer, Integer> entry : std.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println();
        System.out.println("MArks of student 102 : " + std.get(102));
        System.out.println("Does student 105 exists? " + std.containsKey(105));

        System.out.println();
        System.out.println("After updating student 103 : ");
        std.put(103, 80);
        System.out.println(std.get(103));

        System.out.println();
        System.out.println("After removing student 104 : ");
        std.remove(104);
        System.out.println("Final Student Records : ");
        for(Map.Entry<Integer, Integer> entry : std.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
