package Lab_6;

public class Car extends Vehicle {
    private int engineCapacity;
    private double topSpeed;

    public Car() {
        super();
        this.engineCapacity = 0;
        this.topSpeed = 0;
    }

    public Car(String vehicleName,int engineCapacity, double topSpeed) {
        super(vehicleName);
        this.engineCapacity = engineCapacity;
        this.topSpeed = topSpeed;
    }

    @Override
    public double calculateSpeed() {
        return topSpeed;
    }

    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " CC");
        System.out.println("Top Speed: " + topSpeed + " km/h");
    }
}

