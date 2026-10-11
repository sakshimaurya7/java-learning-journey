package Day_25;
import java.util.HashMap;
import java.util.Scanner;

//Search for a student
public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Aman", 85);
        marks.put("Riya", 35);
        marks.put("Kirat", 60);
        marks.put("Neha", 28);
        marks.put("Simran", 72);

        System.out.println("Students record : " + marks);
        System.out.println();
        System.out.print("Enter student's name : ");
        String name = sc.nextLine();
        if(marks.containsKey(name)) {
            System.out.println("Student's name : " + name);
            System.out.println("Marks : " + marks.get(name));
        }
        else {
            System.out.println("Student not found.");
        }

        sc.close();
    }
}
