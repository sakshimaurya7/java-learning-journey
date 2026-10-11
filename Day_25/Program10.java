package Day_25;
import java.util.HashMap;
import java.util.Scanner;

//Remove a Student Record
public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Aman", 85);
        marks.put("Riya", 35);
        marks.put("Kirat", 60);
        marks.put("Neha", 28);
        marks.put("Simram", 72);

        System.out.println("Students record : " + marks);
        System.out.println();
        System.out.print("Enter student's name to remove : ");
        String name = sc.nextLine();
        if(marks.containsKey(name)) {
            marks.remove(name);
            System.out.println("Student's record after removal : " + marks);
        }
        else {
            System.out.println("Student not found.");
        }

        System.out.println();
        System.out.println("Total students : " + marks.size());
        sc.close();
    }    
}
