package Day_13;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    @Override 
    public void start() {
        System.out.println("Car starts.");
    }

    @Override 
    public void stop() {
        System.out.println("Car stops.");
    }
}

class Bike implements Vehicle {
    @Override 
    public void start() {
        System.out.println("Bike starts.");
    }

    @Override 
    public void stop() {
        System.out.println("Bike stops.");
    }
}

public class Program2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();

        Bike bike = new Bike();
        bike.start();
        bike.stop();
    }
}
