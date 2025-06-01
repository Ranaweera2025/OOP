package GetterSetter;

public class Student {
    private String name;
    private int ID;
    private int age;

    Student(){

    }

    Student(String name,int ID,int age){
        this.name=name;
        this.ID=ID;
        this.age=age;
    }



    public String getname(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID){
        this.ID=ID;
    }
    public int getID(){
        return ID;
    }



    public void setAge(int age){
        if(age>50){
            System.out.println("Invalid");
            return;
        }
        this.age=age;

    }

    public int getAge(){
        return age;
    }

}
