package Day_11;

//Method Overloading Example
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
public class Program1 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println("Addition of two numbers : " + cal.add(25, 35));
        System.out.println("Addition of three numbers : " + cal.add(25, 35, 45));
        System.out.println("Addition of two double numbers : " + cal.add(25.5, 35.5));
    }
    
}
