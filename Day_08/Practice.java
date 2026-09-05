package Day_08;

//Class with methods
class Students {
    String name;
    int age;
    String course;

    // Students() {
    //     System.out.println("Student created successfully.");
    // }

    //Parameterized constructor
    Students(String name, int age, String course) {
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
public class Practice {
    public static void main(String[] args) {
        Students student1 = new Students("Aman", 20, "BCA"); //Object 
        // student1.name = "Aman";
        // student1.age = 21;
        // student1.course = "BCA";
        student1.displayDetails();
        // System.out.println("Student 1");
        // System.out.println(student1.name);
        // System.out.println(student1.age);
        // System.out.println(student1.course);
        
        Students student2 = new Students("Naman", 21, "MCA");     //Multiple objects
        // student2.name = "Raman";
        // student2.age = 20;
        // student2.course = "MCA";
        student2.displayDetails();
        // System.out.println("Student 2");
        // System.out.println(student2.name);
        // System.out.println(student2.age);
        // System.out.println(student2.course);
    }   
}
