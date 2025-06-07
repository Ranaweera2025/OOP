package Abstract.Lab9;

public abstract class Transport {
    protected String vehicleNumber;
    protected int distanceTravelled;

    public Transport() {
    }

    public Transport(String vehicleNumber, int distanceTravelled) {
        this.vehicleNumber = vehicleNumber;
        this.distanceTravelled = distanceTravelled;
    }

    public void displayDetails(){
        System.out.println("Vhicle Number : "+vehicleNumber);
        System.out.println("Distance : "+distanceTravelled);
    };

    public abstract double calculateFare();

}