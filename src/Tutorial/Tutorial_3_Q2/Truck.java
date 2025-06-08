package Tutorial.Tutorial_3_Q2;

class Truck extends Vehicle {

    public Truck(){
        super();
    }

    public Truck(String vehicleID, String vehicleName, int rentalDays) {
        super(vehicleID, vehicleName, rentalDays);
    }

    public double calculateRentalCost() {
        return rentalDays * 80;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Vehicle Type: Truck");
        System.out.println("Rental Cost: $" + calculateRentalCost());
    }
}
