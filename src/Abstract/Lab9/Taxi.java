package Abstract.Lab9;

public class Taxi extends Transport{

    @Override
    public double calculateFare() {
        return (20*distanceTravelled)+5;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Transport Type: Taxi");
        System.out.println("Fare: $" + calculateFare());
        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println();
    }
}
