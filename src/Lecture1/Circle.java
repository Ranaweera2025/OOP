package Lecture1;

public class Circle {
    private int radius;

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius=radius;
    }

    public void calcarea(){
        double area=Math.PI*radius*radius;
        System.out.println("Area is : "+area);

    }

    public static void main(String[] args) {
        Circle c=new Circle();
        c.radius=7;
        c.calcarea();
    }
}
