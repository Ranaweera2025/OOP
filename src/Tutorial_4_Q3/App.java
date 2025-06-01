package Tutorial_4_Q3;

public class App {
    public static void main(String[] args) {

        Professor p=new Professor("Saman","Maths");

        University un=new University("SLIIT",p);
        un.dispalydetails();

    }
}
