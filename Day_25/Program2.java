package Day_25;
import java.util.HashMap;
import java.util.Scanner;

//HashMap with User Input
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students : ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();
        System.out.println("Enter student name and marks : ");
        HashMap<String, Integer> marks = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int mark = sc.nextInt();
            sc.nextLine();
            marks.put(name, mark);
        }

        System.out.println();
        System.out.println("Student records : " + marks);
        System.out.println();
        System.out.print("Enter student name to search : ");
        String str = sc.nextLine();
        if(marks.containsKey(str)) {
            System.out.println(str + "'s marks : " + marks.get(str));
        }
        else {
            System.out.println("Student does not exist.");
        }

        System.out.println();
        System.out.println("Total students : " + marks.size());
        sc.close();
    }    
}
