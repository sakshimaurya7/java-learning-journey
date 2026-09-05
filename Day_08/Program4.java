package Day_08;

class Std {
    String name;
    int age;
    String course;

    Std(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Course : " + course);
    }
}

public class Program4 {
    public static void main(String[] args) {
        Std s1 = new Std("Seeta", 24, "MCA");
        s1.displayDetails();
    }
}
