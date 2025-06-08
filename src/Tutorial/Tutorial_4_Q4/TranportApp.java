package Tutorial.Tutorial_4_Q4;

public class TranportApp {
    public static void main(String[] args) {
        Driver d=new Driver("Jhon","ABN3422");
        Driver d1=new Driver("ajd","as");
        Bus b=new Bus("BENZ",130,"SNDGS",d,d1);
        b.start();
    }
}
