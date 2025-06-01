package Lab_6;

public class Vehicle {
    protected String vehicleName;

    public Vehicle() {
        this.vehicleName = "";
    }

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle Name :"+vehicleName);
    }

    public double calculateSpeed() {
        return 0.0;
    }

    public double calculateSpeed(double factor ) {

        return calculateSpeed()*factor;
    }


    public static void main(String[] args) {


        Car car=new Car("BENZ",1500,300);
        car.displayVehicleDetails();
        System.out.println("Speed With Factor :"+car.calculateSpeed(2.5));
        System.out.println();

        Bicycle bi=new Bicycle("DUCATI",6,320);
        bi.displayVehicleDetails();
        System.out.println("Speed With Factor :"+bi.calculateSpeed(2.5));
        System.out.println();


    }

}

