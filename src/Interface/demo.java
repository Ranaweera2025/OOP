package Interface;

public class demo implements Student{

    @Override
    public void eat(){
        System.out.println("Eating");
    }

    @Override
    public void drink() {
        System.out.println("Drinking");
    }

    @Override
    public void run() {
        System.out.println("Running");
    }
}
