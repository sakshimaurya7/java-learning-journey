package Day_08;

//Create Multiple objects of a Book class and display its title, author and price

class Book{
    String title;
    String author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
}

public class Program3 {
    public static void main(String[] args) {
        Book book1 = new Book("Shadowings", "Lafcadio Hearn", 500);
        System.out.println("Book 1");
        book1.displayDetails();
        Book book2 = new Book("Ikigai", "Hector Garcia", 450);
        System.out.println("Book 2");
        book2.displayDetails();
        Book book3 = new Book("Harry Potter", "J.K. Rowling", 800);
        System.out.println("Book 3");
        book3.displayDetails();
    }    
}
