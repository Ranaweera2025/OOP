package Tutorial.Tutorial_4_Q4;

public class Vehicle {
    protected String brand;
    protected double speed;
    protected Engine engine;
    protected Driver driver;

    public Vehicle() {
    }

    public Vehicle(String brand, double speed,String enginetype,Driver driver) {
        this.brand = brand;
        this.speed = speed;
        engine=new Engine(enginetype);
        this.driver=driver;
    }

    public void start (){
        System.out.println("Brand Name : "+brand);
        System.out.println("Speed : "+speed);
        engine.display();
        driver.displaydriver();
    }
}
