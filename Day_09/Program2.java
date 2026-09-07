package Day_09;
import java.util.Scanner;

//Create an Employee class with private variables name, id and salary and getters and setters
class Employee {
    private String name;
    private int id;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee();
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        e1.setName(name);

        System.out.print("Enter ID : ");
        int id = sc.nextInt();  
        e1.setId(id);

        double salary;
        do {
            System.out.print("Enter Salary : ");
            salary = sc.nextDouble();
            if (salary <= 0) {
                System.out.println("Invalid Salary. Please enter again.");
            }
        } while(salary <= 0);
        e1.setSalary(salary);
        

        System.out.println("Name : " + e1.getName());
        System.out.println("ID : " + e1.getId());
        System.out.println("Salary : " + e1.getSalary());

        sc.close();
    }
}
