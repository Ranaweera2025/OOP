package Interface.Printable;

public class Book implements Printable{

    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public void printdetails() {
        System.out.println("Book Details");
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Pric : "+price);
    }
}
