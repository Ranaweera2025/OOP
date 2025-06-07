package Abstract.Lab9;

public class Main {
    public static void main(String[] args) {
        Transport tr=new Bus();
        tr.vehicleNumber="jhshd";
        tr.distanceTravelled=10;
        tr.displayDetails();
        Transport tr2=new Taxi();
        tr2.vehicleNumber="avsg";
        tr2.distanceTravelled=50;
        tr2.displayDetails();
    }
}
