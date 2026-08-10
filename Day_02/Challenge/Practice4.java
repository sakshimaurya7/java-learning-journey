package Day_02.Challenge;

//Calculate the area of a rectangle and a circle
public class Practice4 {
    public static void main(String[] args) {
        int l = 12;
        int b = 23;

        System.out.println("Length of rectangle: " + l);
        System.out.println("Breadth of rectangle: " + b);

        int rectangleArea = l * b;
        System.out.println("Area of rectangle is: " + rectangleArea);

        int r = 5;
        System.out.println("Radius of circle : " + r);

        //float PI = 3.14f;
        double PI = 3.14;
        double circleArea = PI * r * r;

        System.out.println("Area of circle : " + circleArea);
    }
}
