package Day_11;


//Day 10 example using the polymorphism concept
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void work() {
        System.out.println("Employee is working.");
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Developer extends Employee {
    String programmingLanguagae;
    Developer(String name, int id, double salary, String programmingLanguagae) {
        super(name, id, salary);
        this.programmingLanguagae = programmingLanguagae;
    }

    @Override 
    void work() {
        System.out.println("Working as a Developer");
        System.out.println("Writing " + programmingLanguagae + " code.");
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
        System.out.println("Working as a Manager");
        System.out.println("Conducting meeting.");
    }
}

public class Program3 {
    public static void main(String[] args) {
        Employee employee;

        employee = new Developer("John", 101, 40000, "Java");
        employee.displayDetails();
        employee.work();

        System.out.println();
        employee = new Manager("Alice", 102, 50000, 5);
        employee.displayDetails();
        employee.work();
    }    
}
