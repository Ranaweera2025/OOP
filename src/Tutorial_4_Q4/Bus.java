package Tutorial_4_Q4;

public class Bus extends Vehicle {

    private Driver driver;

    public Bus() {
        super();
        this.driver = driver;
    }


    public Bus(String brand, double speed, String enginetype, Driver driver, Driver driver1) {
        super(brand, speed, enginetype, driver);
        this.driver = driver1;
    }

    @Override
    public void start() {
        System.out.println("Bus");
        super.start();
    }
}