package Lab_7_Q2;

public class ComboMeal extends Meal {

    private boolean includesDrinkAndDessert;

    public ComboMeal(){
        super();
        this.includesDrinkAndDessert=false;
    }

    public ComboMeal(String orderID, String customerName, int quantity, boolean includesDrinkAndDessert) {
        super(orderID, customerName, quantity);
        this.includesDrinkAndDessert = includesDrinkAndDessert;
    }

    @Override
    public double calculateBill() {
        double basebill=15.00 * super.calculateBill()/12;
        if(includesDrinkAndDessert){
           return basebill=basebill+5;
        }
        return basebill;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Includes Drink & Dessert: " + (includesDrinkAndDessert ? "Yes" : "No"));
        System.out.println("Total Bill: $" + calculateBill());
    }
}
