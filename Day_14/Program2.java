package Day_14;

class Person {
    String name = "Sumit" ;
    void display() {
        System.out.println("Name : " + name);
    }
}

class Student extends Person {
    String name = "Sonu" ;
    @Override 
    void display() {
        System.out.println("Name : " + super.name);
        System.out.println("Name : " + name);
        super.display();
    }

}

public class Program2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }    
}
