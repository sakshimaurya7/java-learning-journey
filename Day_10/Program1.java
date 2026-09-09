package Day_10;

class Animal {
   String name;

   void eat() {
    System.out.println(name + " is eating.");
   }

   void sleep() {
    System.out.println(name + " is sleeping.");
   }
}

class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class Program1 {
    public static void main(String[] args) {
       Dog dog = new Dog();
       dog.name = "Puff";
       dog.eat();
       dog.sleep();
       dog.bark();
    }    
}
