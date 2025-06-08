package Test.Que_2;

public class Bike extends Vehicle{

    private int capacity;

    public Bike(){
        super();
        this.capacity=0;
    }

    public Bike(String model, double rent, int capacity) {
        super(model, rent);
        this.capacity = capacity;
    }


    @Override
    public void display(int days) {
        super.display(days);
        System.out.println("Capacity : "+capacity);
    }
}
