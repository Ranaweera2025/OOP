package Tutorial_4_Q4;

public class Engine {
    private String enginetype;

    public Engine() {
        enginetype="";
    }

    public Engine(String enginetype) {
        this.enginetype = enginetype;
    }

    public void display(){
        System.out.println("Engine Type : "+enginetype);
    }
}
