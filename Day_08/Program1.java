package Day_08;

class Student {
    String name;
    int age;
    String course;
}
public class Program1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shikha";
        s1.age = 20;
        s1.course = "MCA";
        System.out.println("Name : " + s1.name);
        System.out.println("Age : " + s1.age);
        System.out.println("Course : " + s1.course);
    }
}
