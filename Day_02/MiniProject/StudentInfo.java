package Day_02.MiniProject;
import java.util.Scanner;

//Student Information System
public class StudentInfo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter Age : ");
        int age = sc.nextInt();

        System.out.println("Enter College : ");
        String college = sc.nextLine();

        System.out.println("Enter City : ");
        String city = sc.next();

        System.out.println("Enter Percentage : ");
        float percent = sc.nextFloat();

        System.out.println("==============================");
        System.out.println("STUDENT DETAILS");
        System.out.println("==============================");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("College    : " + college);
        System.out.println("City       : " + city);
        System.out.println("Percentage : " + percent);
        System.out.println("==============================");

        sc.close();
    }
}
