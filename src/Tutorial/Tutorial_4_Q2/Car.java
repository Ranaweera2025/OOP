package Tutorial.Tutorial_4_Q2;

public class Car extends Vehicle {

    private String model;
    private Engine engine;

    public Car() {
        super();
        this.model = "";
    }

    public Car(String brand, int speed, String model, String enginetype) {
        super(brand, speed);
        this.model = model;
        this.engine = new Engine(enginetype);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Model : " + model);
        engine.display();
    }
}
