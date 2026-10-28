import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }
}

public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();

        System.out.print("Enter title: ");
        book.title = sc.nextLine();

        System.out.print("Enter author: ");
        book.author = sc.nextLine();

        System.out.print("Enter price: ");
        book.price = sc.nextDouble();

        book.display();

        sc.close();
    }
}
