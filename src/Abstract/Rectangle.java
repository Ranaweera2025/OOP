
package Abstract;

public class Rectangle extends Shape {

    private int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int getArea() {
        return length * width;
    }
}
