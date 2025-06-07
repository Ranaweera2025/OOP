package Abstract.Lab9;

public class Bus extends Transport{

    @Override
    public double calculateFare() {
        return 10*distanceTravelled;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Transport Type: Bus");
        System.out.println("Fare: $" + calculateFare());
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println();
    }
}
