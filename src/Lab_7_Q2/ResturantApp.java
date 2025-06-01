package Lab_7_Q2;

public class ResturantApp {
    public static void main(String[] args) {
        RegularMeal regularMeal = new RegularMeal();
        regularMeal.Display();
        System.out.println("Total Bill with $5 coupon: $" + regularMeal.calculateBill());
        System.out.println();

        ComboMeal comboMeal = new ComboMeal("ORD789", "Saman", 10, true);
        comboMeal.Display();
        System.out.println("Total Bill with $5 coupon: $" +comboMeal.calculateBill(5));
        System.out.println();

        RegularMeal re=new RegularMeal("ORD342","Kamal",20,false);
        re.Display();
        System.out.println("Total Bill with $10 coupon: $"+re.calculateBill(10));
        System.out.println();
        
    }
}
