package Tutorial_4_Q4;

public class Truck extends Vehicle {

    public Truck(){
        super();
    }

    @Override
    public void start() {
        System.out.println("Truck");
        super.start();
    }
}
