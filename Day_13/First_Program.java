package Day_13;

interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override 
    public void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat implements Animal {
    @Override 
    public void sound() {
        System.out.println("Cat meows.");
    }
}

public class First_Program {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
    }
}
