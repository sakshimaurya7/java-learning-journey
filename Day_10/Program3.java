package Day_10;
import java.util.Scanner;

class Person {
    String name;
    int age;
    void displayPerson(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

class Student extends Person {
    String course;
    void displayStudent() {
        displayPerson();
        System.out.println("Course : "+ course);
    }
}

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student std = new Student();
        System.out.print("Enter name : ");
        std.name = sc.nextLine();

        System.out.print("Enter age : ");
        std.age = sc.nextInt();

        System.out.print("Enter course : ");
        sc.nextLine();
        std.course = sc.nextLine();

        std.displayStudent();

        sc.close();
    }    
}
