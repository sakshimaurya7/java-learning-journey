package Day_08.MiniProject;
import java.util.Scanner;

//Create a Student class with methods to display student details, check if the student has passed or failed, and calculate the grade based on marks.
class Studentss {
    String name;
    int age;
    String course;
    int marks;

    Studentss(String name, int age, String course, int marks) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println();
        System.out.println("Student Details");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Course : " + course);
        System.out.println("Marks : " + marks);
    }

    boolean isPassed() {
        return marks >= 40;
    }

    void calculateGrade() {
        if(marks >= 90) {
            System.out.print("A+");
        }
        else if(marks >= 80) {
            System.out.print("A");
        }
        else if(marks >= 70) {
            System.out.print("B");
        }
        else if(marks >= 60) {
            System.out.print("C");
        }
        else if(marks >= 40) {
            System.out.print("D");
        }
        else {
            System.out.print("F");
        }
    }
}


public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        System.out.print("Enter Course : ");
        sc.nextLine(); // Consume the newline character
        String course = sc.nextLine();
        System.out.print("Enter Marks : ");
        int marks = sc.nextInt();

        Studentss student = new Studentss(name, age, course, marks);
        if(marks > 0 && marks <= 100) {
            student.displayDetails();
            if(student.isPassed()) {
                System.out.println("Status : Passed");
            }
            else {
                System.out.println("Status : Failed");
            }
            System.out.print("Grade : ");
            student.calculateGrade();
        }
        else {
            System.out.println("Invalid Marks");
        }

        sc.close();
    }    
}
