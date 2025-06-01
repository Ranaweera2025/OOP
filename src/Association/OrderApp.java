package Association;

public class OrderApp {
    public static void main(String[] args) {
        Item item1 = new Item("Laptop", 1200.00);
        Item item2 = new Item("Mouse", 25.50);
        Item item3=new Item("Keybord",11500);

        Item[] orderItems = { item1, item2 ,item3};

        Order order = new Order("ORD1001", orderItems);
        order.displayOrderDetails();
    }
}

