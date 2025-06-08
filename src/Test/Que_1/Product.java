package Test.Que_1;

public class Product {
    protected int productID;
    protected String name;
    protected double price;


    public Product() {
        productID=0;
        name="";
        price=0;
    }

    public Product(int productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }


    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void displaydetails(){
        System.out.println("Product ID : "+productID);
        System.out.println("Name : "+name);
        System.out.println("Price : "+price);
    }
}
