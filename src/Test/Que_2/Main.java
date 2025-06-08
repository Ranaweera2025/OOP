package Test.Que_2;

public class Main {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.display(2);
        System.out.println();

        Car c=new Car("Benz",20000,5);
        c.display(3);
        System.out.println();

        Bike b=new Bike("Yamaha",4000,600);
        b.display(2);


    }
}
