package Abstarct;

public class Main {
    public static void main(String[] args) {

        Rectangle r=new Rectangle() ;
        r.length=12;
        r.length=12;
        System.out.println("Area of the Rectangle : "+r.GetArea());

        System.out.println();
        Circle c1=new Circle();
        c1.radius=7;
        System.out.println("Area of the Circle : "+c1.GetArea());
    }
}
