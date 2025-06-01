package Lab_7_Q2;

public class Meal {
    protected String orderID;
    protected String customerName;
    protected int quantity;

    public Meal() {
        orderID = null;
        customerName = "";
        quantity = 0;
    }

    public Meal(String orderID, String customerName, int quantity) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.quantity = quantity;
    }

    public void Display() {
        System.out.println("Order ID : " + orderID);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Quantity : " + quantity);
    }

    public double calculateBill() {
        return 12.0*quantity;
    }

    public double calculateBill(int couponAmount) {
        double totalBill = calculateBill();
        double discountedBill = totalBill - couponAmount;
        return discountedBill;
    }
}
