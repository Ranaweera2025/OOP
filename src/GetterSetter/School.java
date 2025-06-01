package GetterSetter;

public class School {
    private int stuId;
    private String name;
    private int batchID;

    public void setStuId(int id){
        if(id<1){
            System.out.println("Must be greater than 0");
            return;
        }
        this.stuId=id;
    }
    public int getStuId(){
        return stuId;
    }


    public void setName(String name){
        this.name = name;


    }    public String getName(){
        return name;
    }


    public void setBatchID(int batchID){
        this.batchID=batchID;
    }
    public int getBatchID(){
        return batchID;
    }




}
