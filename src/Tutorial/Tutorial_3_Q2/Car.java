package Tutorial.Tutorial_3_Q2;

class Car extends Vehicle {

    public Car(String vehicleID, String vehicleName, int rentalDays) {
        super(vehicleID, vehicleName, rentalDays);
    }

    public double calculateRentalCost() {
        return rentalDays *50;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Vehicle Type: Car");
        System.out.println("Rental Cost: $" + calculateRentalCost());
    }
}