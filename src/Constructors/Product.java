package Constructors;
import java.util.Scanner;
public class Product {
    private int  productId;
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
       if(price<0){
           System.out.println("Invalid");
           return;
       }
       this.price=price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void assigndetails(){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Product ID : ");
        this.productId= sc.nextInt();
        sc.nextLine();

        System.out.print("Name : ");
        this.name=sc.nextLine();

        System.out.print("Price : ");
        sc.nextDouble();

        System.out.print("Amount : ");
        this.quantity=sc.nextInt();

        System.out.println("-----------------------------------------------");
    }

    public void Display(){
        System.out.println("-----Displaying Details-----");
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }
}
