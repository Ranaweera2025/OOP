package Association;

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item: " + name + ", Price: $" + price);
    }

    public double getPrice() {
        return price;
    }
}
