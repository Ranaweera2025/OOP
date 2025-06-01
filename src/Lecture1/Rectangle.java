package Lecture1;

public class Rectangle {
    private int width;
    private int length;

    public void calcarea(){
       int area=length*width;
        System.out.println("Area is :"+area);
    }

    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.length=2;
        r1.width=5;
        System.out.println("Width is : "+r1.width);
        r1.calcarea();
    }
}
