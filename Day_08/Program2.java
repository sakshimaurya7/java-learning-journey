package Day_08;

//Create a car class and display its details using displayDetails method in the class
class Car{
    String brand;
    String model;
    int year;
    int price;

    void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println("Price : " + price);
    }
}
public class Program2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2024;
        car1.price = 2000000;

        car1.displayDetails();
    }
}
