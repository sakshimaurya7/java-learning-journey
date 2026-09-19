package Day_14;

class Employee {
    String name;
    static String company = "ABC Technologies";

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Employee Name : " + name);
        System.out.println("Company : " + company);
    }
}
public class Program3 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kunal");
        e1.display();

        Employee e2 = new Employee("Dev");
        e2.display();
    }
}
