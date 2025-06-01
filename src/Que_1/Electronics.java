package Que_1;

public class Electronics extends Product{

    private String brand;

    public Electronics() {
        super();
        this.brand = "";
    }

    public Electronics(int productID, String name, double price,String brand) {
        super(productID, name, price);
        this.brand=brand;
    }

    @Override
    public void displaydetails() {
        super.displaydetails();
        System.out.println("Brand Name : "+brand);
    }
}
