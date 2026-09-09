package Day_10;
import java.util.Scanner;

class Vehicle {
    String brand;
    int speed;

    void displayVehicle() {
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int numberOfDoors;
    void displayCar() {
        System.out.println("Number of Doors : " + numberOfDoors);
    }
}

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car = new Car();
        System.out.print("Enter Car Brand : ");
        car.brand = sc.nextLine();

        System.out.print("Enter Car Speed : ");
        car.speed = sc.nextInt();

        System.out.print("Enter number of Doors in car : ");
        car.numberOfDoors = sc.nextInt();

        car.displayVehicle();
        car.displayCar();

        sc.close();
    }
}
