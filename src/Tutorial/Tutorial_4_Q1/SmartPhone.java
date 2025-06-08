package Tutorial.Tutorial_4_Q1;

public class SmartPhone {
    private Battery battery;
    private Processor processor;
    private String name;


    public SmartPhone(String name,int batterycapacity,String processormodel){
        battery=new Battery(batterycapacity);
        processor=new Processor(processormodel);
        this.name=name;
    }
    public void displaydetails(){
        System.out.println("Name : "+name);
        battery.display();
        processor.display();
    }

}
