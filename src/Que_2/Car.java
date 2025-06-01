package Que_2;

public class Car extends Vehicle{

    private int seats;

    public Car(){
        super();
        this.seats=0;
    }

    public Car(String model, double rent, int seats) {
        super(model, rent);
        this.seats = seats;
    }


    @Override
    public void display(int days) {
        super.display(days);
        System.out.println("No of seats : "+seats);
    }
}
