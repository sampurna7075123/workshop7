package workshop7.Question_1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "The Alchemist";
        book1.author = "Paulo Coelho";
        book1.price = 499.50;

        Book book2 = new Book();
        book2.title = "Atomic Habits";
        book2.author = "James Clear";
        book2.price = 650.00;

        System.out.println("Book 1");
        System.out.println("Title: " + book1.title);
        System.out.println("Author: " + book1.author);
        System.out.println("Price: " + book1.price);

        System.out.println();

        System.out.println("Book 2");
        System.out.println("Title: " + book2.title);
        System.out.println("Author: " + book2.author);
        System.out.println("Price: " + book2.price);
    }
}
