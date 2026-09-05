package Day_08;
import java.util.Scanner;

//Create a rectangle class and calculate the area and perimeter of the rectangle and display it
class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea(){
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length : ");
        double length = sc.nextDouble();
        
        System.out.print("Width : ");
        double width = sc.nextDouble();

        Rectangle rect = new Rectangle(length, width);
        System.out.println("Area : " + rect.calculateArea());
        System.out.println("Perimeter : " + rect.calculatePerimeter());
        
        sc.close();
    }
}
