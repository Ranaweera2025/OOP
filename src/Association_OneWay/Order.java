package Association_OneWay;

public class Order {

    private int orderID;
    private Item[] items;

    public Order(int orderID,Item[] items){
        this.orderID=orderID;
        this.items=items;
    }
    public void DisplayOrder(){
        System.out.println("Order ID :"+orderID);
        double total=0.0;

       for (int x=0;x<=items.length;x++){
           items[x].DisplayItem();
           total+= items[x].getPrice();
       }

        System.out.println("total amount :"+total);
    }
}
