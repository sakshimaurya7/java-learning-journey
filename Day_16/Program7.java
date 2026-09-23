package Day_16;
import java.util.Scanner;


public class Program7 {

    static void checkMarks(int marks) throws Exception {
        if(marks < 0 || marks > 100) {
                throw new Exception("Marks should not be below 0 or above 100");
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Student's marks : ");
            int marks = sc.nextInt();
            checkMarks(marks);
             System.out.println("Valid Marks");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
