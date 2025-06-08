package Tutorial.Tutorial_3_Q4;

public class Book {

    private Author author;
    private String bookid;
    private String Titlee;
    private double price;
    private int quantity;


    public Book(){
        this.bookid="";
        this.Titlee="";
        this.price=0;
        this.quantity=0;
        this.author=new Author();
    }


    public Book(String bookid, String titlee, double price, int quantity,String name,String nationality) {
        this.bookid = bookid;
        Titlee = titlee;
        this.price = price;
        this.quantity = quantity;
        author=new Author(name,nationality);
    }

    public void Displaydetails(){
        System.out.println("Book ID : "+bookid);
        System.out.println("Title : "+Titlee);
        System.out.println("Price : "+price);
        System.out.println("Quantity : "+quantity);
        author.Display();

    }

    public boolean isAvailable(){
        return quantity>=0;
    }

    public boolean isAvailable(int requestedQuantity){
        return requestedQuantity<quantity;
    }
}
