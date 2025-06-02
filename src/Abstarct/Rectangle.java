package Abstarct;

public class Rectangle extends Shape{

    int length,width;

    @Override
    public int GetArea() {
        return length*width ;
    }
}
