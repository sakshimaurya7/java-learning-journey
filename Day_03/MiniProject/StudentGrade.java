package Day_03.MiniProject;

import java.util.Scanner;

//Student Grade Calculator
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Student Name : ");
        String name = sc.nextLine();

        System.out.print("Maths Marks : ");
        int mathMarks = sc.nextInt();

        System.out.print("Science Marks : ");
        int sciMarks = sc.nextInt();

        System.out.print("English Marks : ");
        int engMarks = sc.nextInt();

        if (mathMarks > 100 || sciMarks > 100 || engMarks > 100) {
            System.out.println("Marks cannot be greater than 100.");
        } else if (mathMarks < 0 || sciMarks < 0 || engMarks < 0) {
            System.out.println("Marks cannot be negative.");
        } else {
            System.out.println("===================================");
            System.out.println("\t STUDENT REPORT");
            System.out.println("===================================");

            System.out.println("Student Name : " + name);
            System.out.println("");
            System.out.println("Maths        : " + mathMarks);
            System.out.println("Science      : " + sciMarks);
            System.out.println("English      : " + engMarks);

            int total = mathMarks + sciMarks + engMarks;

            System.out.println("");
            System.out.println("Total        : " + total);

            double average = total / 3.0;
            System.out.println("Average      : " + average);

            double percent = (total / 300.0) * 100;
            System.out.println("Percentage   : " + percent);

            if (percent >= 90) {
                System.out.println("Grade        : A+");
            } else if (percent >= 80) {
                System.out.println("Grade        : A");

            } else if (percent >= 70) {
                System.out.println("Grade        : B");
            } else if (percent >= 60) {
                System.out.println("Grade        : C");

            } else if (percent >= 50) {
                System.out.println("Grade        : D");
            } else {
                System.out.println("Grade        : Fail");
            }
        }

        sc.close();
    }
}
