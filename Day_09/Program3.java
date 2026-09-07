package Day_09;
import java.util.Scanner;

//create a Rectangle class with private variables length and breadth and constructor, getters, setters, calculateArea and calculatePerimeter methods.
class Rectangle {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    
}

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double length, width;

        do {
            System.out.print("Enter Length : ");
            length = sc.nextDouble();
            if (length <= 0) {
                System.out.println("Invalid Length. Please enter again.");
            }
        } while (length <= 0);

        do {
            System.out.print("Enter Width : ");
            width = sc.nextDouble();
            if (width <= 0) {
                System.out.println("Invalid Width. Please enter again.");
            }
        } while (width <= 0);
        
        Rectangle r1 = new Rectangle(length, width);
        //r1.setLength(20);
        System.out.println("Length : " + r1.getLength());
        System.out.println("Width : " + r1.getWidth());
        System.out.println("Area : " + r1.calculateArea());
        System.out.println("Perimeter : " + r1.calculatePerimeter());

        sc.close();
    }
}
