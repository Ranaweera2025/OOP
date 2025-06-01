package tutorial_3_Q3;

public class Mainapp {
    public static void main(String[] args) {
        Regularcourse rc=new Regularcourse(1232,"abs",3,true);
        rc.Display();
        System.out.println("With 10% discount ------>$" +rc.calculatefee(10));
        System.out.println();


        PremiumCourse pc=new PremiumCourse(1234,"nnsnaj",4,true);
        pc.Display();
        System.out.println("With 20 % discount ------>$" +pc.calculatefee(20));
        System.out.println();

        Regularcourse r=new Regularcourse();
        r.Display();

    }
}
