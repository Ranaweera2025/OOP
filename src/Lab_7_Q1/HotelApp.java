package Lab_7_Q1;

public class HotelApp {
    public static void main(String[] args) {
        StandardRoom std=new StandardRoom();

        Room room=new Room(45,"Saman",5);
        room.calculateRoomCost();
        room.displayDetails();
        System.out.println();

        StandardRoom standard=new StandardRoom(45,"Kamal",4,true);
        standard.calculateRoomCost();
        standard.displayDetails();
        standard.calculateRoomCost(5);
        System.out.println();

        LuxurySuite luxury=new LuxurySuite(75,"Nimal",6,false,true);
        luxury.calculateRoomCost();
        luxury.displayDetails();

    }
}