package Day_14;

class Book {
    String title;
    double price;

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println("Title : " + title);
        System.out.println("Price : " + price);
    }
}

public class Program1 {
    public static void main(String[] args) {
        Book b1 = new Book("The Art of Living", 500.00);
        b1.display();
    }
}
