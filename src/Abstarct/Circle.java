package Abstarct;

public class Circle extends Shape{

    int radius;

    @Override
    public int GetArea() {
        return (int) (3.14*radius*radius);
    }
}
