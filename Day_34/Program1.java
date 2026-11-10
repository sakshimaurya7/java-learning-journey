package Day_34;
import java.util.HashMap;
import java.util.TreeSet;

//Find the Second Highest Distinct Salary Using the HashMap and TreeSet
public class Program1 {
    public static void main(String[] args) {
        HashMap<String, Integer> emp = new HashMap<>();
        emp.put("Aman", 25000);
        emp.put("Rahul", 35000);
        emp.put("Simran", 45000);
        emp.put("Neha", 35000);
        emp.put("Karan", 50000);
        emp.put("Priya", 40000);

        TreeSet<Integer> salarySet = new TreeSet<>(emp.values());
        System.out.println("Unique Salaries (Ascending Order): ");
        System.out.println();
        for(Integer salary : salarySet) {
            System.out.println(salary);
        }

        System.out.println();
        System.out.println("Second Highest Distinct Salary : ");
        Integer secondHighestSalary = salarySet.lower(salarySet.last());
        System.out.print(secondHighestSalary);

        System.out.println();
        System.out.println("Employee(s) earning second highest salary : ");
        for(String name : emp.keySet()) {
            if(emp.get(name).equals(secondHighestSalary)) {
                System.out.println(name + " : " + emp.get(name));
            }
        }
    }
}    
