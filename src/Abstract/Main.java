package Abstract;

public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 5);
        Shape circle = new Circle(7);

        System.out.println("Rectangle Area: " + rect.getArea());
        System.out.println("Circle Area: " + circle.getArea());
    }
}
