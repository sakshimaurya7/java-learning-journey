package Day_14;

class Circle {
    final double PI = 3.14159;
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    final void Area() {
        System.out.println("Area of a circle : " + (PI * radius * radius));
    }
}

// class Sphere extends Circle {
//     int r;

//     Sphere(int r) {
//         this.r = r;
//     }

//     @Override 
//     void Area() {
//         System.out.println("Area of Sphere : " + (4 * PI * r * r));
//     }
// }

public class Program4 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        c1.Area();
    }    
}
