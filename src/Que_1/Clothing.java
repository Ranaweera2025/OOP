package Que_1;

public class Clothing extends Product{
    private String size;
    private String color;

    public Clothing(){
        super();
        this.size="";
        this.color="";

    }

    public Clothing(int productID, String name, double price, String size, String color) {
        super(productID, name, price);
        this.size = size;
        this.color = color;
    }

    @Override
    public void displaydetails() {
        super.displaydetails();
        System.out.println("Size : "+size+"  Color : "+color);
    }
}
