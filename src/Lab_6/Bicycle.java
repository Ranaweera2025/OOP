package Lab_6;

public class Bicycle extends Vehicle {
    private int gearCount;
    private double  maxPedalSpeed;

    public Bicycle(){
        super();
        this.gearCount = 0;
        this.maxPedalSpeed = 0;
    }
    public Bicycle(String vehicleName , int gearCount, double  maxPedalSpeed) {
        super(vehicleName);
        this.gearCount = gearCount;
        this.maxPedalSpeed = maxPedalSpeed;
    }

    @Override
    public double calculateSpeed() {
        return maxPedalSpeed;
    }

    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Gear Count: " + gearCount);
        System.out.println("Max Speed: " + maxPedalSpeed);

    }
}

