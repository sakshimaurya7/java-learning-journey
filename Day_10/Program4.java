package Day_10;

import java.util.Scanner;

class Employee {
    String name;
    double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + salary);
    }
}

class Manager extends Employee {
    String department;
    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void displayManager() {
        System.out.println("Department : " + department
        );
    }
}

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name : ");
        String name = sc.nextLine();

        double salary;
        do {
            System.out.print("Enter salary : ");
            salary = sc.nextDouble();
            if(salary <= 0) {
                System.out.println("Invalid Salary amount. Please enter valid amount.");
            }
        }while(salary <= 0);
        

        System.out.print("Enter department : ");
        sc.nextLine();
        String department = sc.nextLine();

        Manager mg = new Manager(name, salary, department);

        mg.displayEmployee();
        mg.displayManager();

        sc.close();
    }
}
