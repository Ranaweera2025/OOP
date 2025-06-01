package Lab_7_Q2;


public class RegularMeal extends Meal {

    private boolean isVegetarian;

    public RegularMeal() {
        super();
        this.isVegetarian = false;
    }

    public RegularMeal(String orderID, String customerName, int quantity, boolean isVegetarian) {
        super(orderID, customerName, quantity);
        this.isVegetarian = isVegetarian;
    }

    @Override
    public double calculateBill() {
        return 10*super.calculateBill()/12;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Veg or Non Veg : "+isVegetarian);
        System.out.println("total cost : "+calculateBill());
    }
}
