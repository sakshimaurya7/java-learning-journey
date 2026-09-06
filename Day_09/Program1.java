package Day_09;
import java.util.Scanner;

//create a Student class with private variables name, age and course and age must be greater than 0. 
class Students {
    private String name;
    private int age;
    private String course;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
        else {
            System.out.println("Invalid Age.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Students s1 = new Students();
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        s1.setName(name);

        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        s1.setAge(age);

        System.out.print("Enter Course : ");
        String course = sc.next();
        s1.setCourse(course);

        System.out.println("Name : " + s1.getName());
        System.out.println("Age : " + s1.getAge());
        System.out.println("Course : " + s1.getCourse());

        sc.close();
    }
}
