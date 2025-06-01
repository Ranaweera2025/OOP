package Dependency;

public class PrintApp {
    public static void main(String[] args) {
        Document doc=new Document("Welcome");
       Print p=new Print();
       p.print(doc);

    }
}
