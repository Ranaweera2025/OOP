package Lab_7_Q1;

public class Room {
    protected  int room_number;
    protected String  guest_name;
    protected int number_of_nights;

    public Room() {
        room_number=0;
        guest_name="";
        number_of_nights=0;
    }

    public Room(int room_number, String guest_name, int number_of_nights) {
        this.room_number = room_number;
        this.guest_name = guest_name;
        this.number_of_nights = number_of_nights;
    }

    public void displayDetails(){
        System.out.println("Room Number :"+room_number);
        System.out.println("Guest Name :"+guest_name);
        System.out.println("Number of Nights :"+number_of_nights);
        System.out.println("Room Cost :"+calculateRoomCost());
    }
    public double calculateRoomCost(){
        return 150;
    }

    public double calculateRoomCost(double discountpernight){
        double baserate=calculateRoomCost();
        double total=discountpernight*number_of_nights;
        System.out.println("Discount :"+(baserate-total));
        return baserate-total;

    }


}

