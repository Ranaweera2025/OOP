package Lab_7_Q1;

public class StandardRoom extends Room{
    private  boolean indicarewifi;

    public StandardRoom(){
        super();
        this.indicarewifi=false;

    }

    public StandardRoom(int room_number, String guest_name, int number_of_nights, boolean indicarewifi) {
        super(room_number, guest_name, number_of_nights);
        this.indicarewifi = indicarewifi;
    }

    @Override
    public double calculateRoomCost() {
        return (100*number_of_nights);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Total Room Cost :"+calculateRoomCost());
        System.out.println("WiFi Status :"+(indicarewifi ? "Included" :"Not Included"));
    }
}
