package Association_OneWay;

public class Main {
    public static void main(String[] args) {
        Item item1=new Item(24,240);
        Item item2=new Item(45,350);

        Item [] orderItems={item1,item2};

        Order od=new Order(23,orderItems);

        od.DisplayOrder();
    }
}
