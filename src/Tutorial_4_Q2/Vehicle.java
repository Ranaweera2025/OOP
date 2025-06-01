package Tutorial_4_Q2;

public class Vehicle {
    private String brand;
    private int speed;

    public Vehicle() {
        this.brand = "";
        this.speed = 0;
    }

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed + " km/h");
    }
}
