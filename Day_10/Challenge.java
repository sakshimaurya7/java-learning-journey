package Day_10;
import java.util.Scanner;


class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Salary : " + salary);
    }

    void work() {
        System.out.println("Working as an employee.");
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void work() {
        System.out.println("Working as a Developer");
    }

    void writeCode() {
        displayDetails();
        System.out.println("Programming Language : " + programmingLanguage);
        System.out.println("Writing " + programmingLanguage + " code.");
    }
}

class Manager extends Employee {
    int teamSize;

    void work() {
        System.out.println("Working as a Manager");
    }

    void conductMeeting() {
        displayDetails();
        System.out.println("Team Size : " + teamSize);
        System.out.println("Conducting meeting");
    }
}


public class Challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Developer dev = new Developer();
        System.out.print("Enter Developer Name : ");
        dev.name = sc.nextLine();
        System.out.print("Enter Developer Id : ");
        dev.id = sc.nextInt();
        System.out.print("Enter Developer Salary : ");
        dev.salary = sc.nextDouble();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter Programming Language : ");
        dev.programmingLanguage = sc.nextLine();

        Manager mgr = new Manager();
        System.out.print("Enter Manager Name : ");
        mgr.name = sc.nextLine();
        System.out.print("Enter Manager Id : ");
        mgr.id = sc.nextInt();
        System.out.print("Enter Manager Salary : ");
        mgr.salary = sc.nextDouble();
        System.out.print("Enter Team Size : ");
        mgr.teamSize = sc.nextInt();

        System.out.println("\nDeveloper Details:");
        dev.writeCode();
        dev.work();

        System.out.println("\nManager Details:");
        mgr.conductMeeting();
        mgr.work();

        sc.close();
    }
}
