package Association_OneWay;

public class Item {
    private int ID;
    private double Price;

    public Item(int ID,double Price){
        this.ID=ID;
        this.Price=Price;
    }

    public void DisplayItem(){
        System.out.println("ID :"+ID);
        System.out.println("Price :"+Price);
    }
    public double getPrice(){
        return Price;
    }
}
