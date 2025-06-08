package Test.Que_2;

public class Vehicle {
    protected String model;
    protected double rent;

    public Vehicle() {
        this.model="";
        this.rent=0;

    }

    public Vehicle(String model, double rent) {
        this.model = model;
        this.rent = rent;
    }


    public double calc(int days){
        return rent*days;
    }


    public void display(int days){
        System.out.println("Model : "+model);
        System.out.println("Rent : "+rent);
        System.out.println("Payment : "+calc(days));
    }


}
