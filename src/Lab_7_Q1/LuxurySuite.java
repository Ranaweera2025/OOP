package Lab_7_Q1;

public class LuxurySuite extends Room{
    private boolean indicatebreakfast;
    private boolean indicateairportpickup;

    public LuxurySuite() {
        super();
        this.indicateairportpickup=false;
        this.indicatebreakfast=false;
    }

    public LuxurySuite(int room_number, String guest_name, int number_of_nights, boolean indicatebreakfast, boolean indicateairportpickup) {
        super(room_number, guest_name, number_of_nights);
        this.indicatebreakfast = indicatebreakfast;
        this.indicateairportpickup = indicateairportpickup;
    }

    @Override
    public double calculateRoomCost() {
        if(indicateairportpickup&indicateairportpickup){
            return (200*number_of_nights)+75;}

        return 200*number_of_nights;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Include Breakfast :"+(indicatebreakfast ? "Included" : "Not Included"));
        System.out.println("Include PickUp :"+(indicateairportpickup ? "Included" : "Not Included"));
    }
}
