package Dependency;

public class Document {
    private String content;

    public Document(String content){
        this.content=content;
    }

    public void display(){
        System.out.println("Document Content : "+content);
    }
}
