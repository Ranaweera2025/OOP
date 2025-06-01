package Association;

class Order {
    private String orderID;
    private Item[] items;

    public Order(String orderID, Item[] items) {
        this.orderID = orderID;
        this.items = items;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);

        System.out.println("-----Items in the order-----");

        double total = 0.0;
        for (int i = 0; i < items.length; i++) {
            items[i].displayDetails();
            total += items[i].getPrice();
        }
        System.out.println("Total Order Cost: $" + total);
    }
}

