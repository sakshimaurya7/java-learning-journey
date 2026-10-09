package Day_25;
import java.util.HashMap;
import java.util.Scanner;

//Update Student's Marks
public class Program3 {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Aman", 85);
        marks.put("Riya", 95);
        marks.put("Kirat", 90);
        System.out.println("Student records : " + marks);
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name to update : ");
        String name = sc.nextLine();
        if(marks.containsKey(name)) {
            System.out.print("Enter new marks : ");
            int newMarks = sc.nextInt();
            marks.put(name, newMarks);
            System.out.println();
            System.out.println("Updated student records : " + marks);
        }
        else {
            System.out.println("Student not found");
        }
        sc.close();
    }
}
