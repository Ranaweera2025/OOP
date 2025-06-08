package Tutorial.Tutorial_3_Q2;

class Vehicle {
    protected String vehicleID;
    protected String vehicleName;
    protected int rentalDays;

    public Vehicle() {
        this.vehicleID = "";
        this.vehicleName = "";
        this.rentalDays = 0;
    }


    public Vehicle(String vehicleID, String vehicleName, int rentalDays) {
        this.vehicleID = vehicleID;
        this.vehicleName = vehicleName;
        this.rentalDays = rentalDays;
    }


    public void displayDetails() {
        System.out.println("Vehicle ID: " + vehicleID);
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Rental Days: " + rentalDays);
    }
}

