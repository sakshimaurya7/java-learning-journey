package Day_05.MiniProject;
import java.util.Scanner;

public class StudentUtility {
    static int calculateTotal(int maths, int science, int english) {
        return maths + science + english;
    }
    static double calculateAverage(int total) {
        return total/3.0;
    }
    static double calculatePercentage(int total) {
        return (total/300.0)*100;
    }
    static String calculateGrade(double percentage) {
        if(percentage >=90) {
            return "A+";
        }
        else if(percentage >= 80) {
            return "A";
        }
        else if (percentage >= 70) {
            return "B";
        }
        else if (percentage >= 60) {
            return "C";
        }
        else if (percentage >= 50) {
            return "D";
        }
        else {
            return "Fail";
        }
    }
    static boolean isPass(double percentage) {
        return percentage >= 50;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Student Name : ");
        String name = sc.nextLine();
        System.out.print("Maths Marks : ");
        int maths = sc.nextInt();
        System.out.print("Science Marks : ");
        int science = sc.nextInt();
        System.out.print("English Marks : ");
        int english = sc.nextInt();

        System.out.println("========================================");
        System.out.println("\t STUDENT REPORT");
        System.out.println("========================================");
        System.out.println("Student Name  : " + name);
        System.out.println();
        System.out.println("Maths         : " + maths);
        System.out.println("Science       : " + science);
        System.out.println("English       : " + english);
        System.out.println();

        int total = calculateTotal(maths, science, english);
        System.out.println("Total         : " + total);
        
        double average = calculateAverage(total);
        System.out.println("Average       : " + average);

        double percentage = calculatePercentage(total);
        System.out.println("Percentage    : " + percentage);

        String grade = calculateGrade(percentage);
        System.out.println("Grade         : " + grade);

        boolean pass = isPass(percentage);
        System.out.println("Pass          : " + pass);
        System.out.println("========================================");


        sc.close();
    }
}
