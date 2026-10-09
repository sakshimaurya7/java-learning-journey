package Day_25;
import java.util.HashMap;

public class Program1 {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Shikha", 90);
        marks.put("Aman", 85);
        marks.put("Riya", 95);
        System.out.println("HashMap : " + marks);
        System.out.println();
        System.out.println("Shikha's marks : " + marks.get("Shikha"));
        System.out.println("Aman exists : " + marks.containsKey("Aman"));
        System.out.println("Marks 95 exists : " + marks.containsValue(95));
        System.out.println();
        marks.put("Shikha", 92);
        System.out.println("After Updating Shikha : " + marks);
        marks.remove("Aman");
        System.out.println("After removing Aman : " + marks);
        System.out.println("Size : " + marks.size());
    }    
}
