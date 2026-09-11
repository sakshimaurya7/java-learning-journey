package Day_12;


abstract class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    abstract void work();

    void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Salary : " + salary);
    }
}

class Developer extends Employee {
    String programmingLanguage;
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override 
    void work() {
        System.out.println("Working as a Developer.");
        System.out.println("Writing " + programmingLanguage + " code.");
    }
}

class Manager extends Employee {
    int teamSize;
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override 
    void work() {
        System.out.println("Working as a Manager.");
        System.out.println("Conducting meeting.");
    }
}

public class Program3 {
    public static void main(String[] args) {
        // Developer dev = new Developer("John", 101, 40000, "Java");
        // dev.displayDetails();
        // dev.work();

        // System.out.println();
        // Manager mng = new Manager("Alice", 201, 50000, 4);
        // mng.displayDetails();
        // mng.work();

        Employee emp;

        emp = new Developer("John", 101, 40000, "Java");
        emp.displayDetails();
        emp.work();

        emp = new Manager("Alice", 201, 50000, 4);
        emp.displayDetails();
        emp.work();
        
    };
}    

