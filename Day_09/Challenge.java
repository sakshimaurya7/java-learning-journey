package Day_09;
import java.util.Scanner;

//Improve the Student Result System from Day_08 by adding the encapsulation feature
class StudentResultSystem {
    private String name;
    private int age;
    private String course;
    private int marks;

    StudentResultSystem(String name, int age, String course, int marks) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public void setMarks(int marks) {
        if(marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
        else {
            System.out.println("Invalid Marks.");
        }
    }

     public int getMarks() {
        return marks;
    }

    public boolean isPassed() {
        return marks >= 40;
    }

    public String calculateGrade() {
        if(marks >= 90) {
            return "A+";
        } else if(marks >= 80) {
            return "A";
        } else if(marks >= 70) {
            return "B";
        } else if(marks >= 60) {
            return "C";
        } else if(marks >= 40) {
            return "D";
        } else {
            return "F";
        }
    }
}
public class Challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Student Course: ");
        String course = sc.nextLine();
        
        int marks;
        do {
            System.out.print("Enter Student Marks: ");
            marks = sc.nextInt();
            if(marks < 0 || marks > 100) {
                System.out.println("Invalid Marks. Please enter marks between 0 and 100.");
            }
        } while(marks < 0 || marks > 100);
        
        StudentResultSystem student = new StudentResultSystem(name, age, course, marks);
        System.out.println();
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Course: " + student.getCourse());
        System.out.println("Marks: " + student.getMarks());
        System.out.println("Pass Status: " + (student.isPassed() ? "Passed" : "Failed"));
        System.out.println("Grade: " + student.calculateGrade());

        sc.close();
    }
}
