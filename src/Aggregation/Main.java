package Aggregation;

public class Main {
    public static void main(String[] args) {

        Book book1=new Book("Baddegama","abcd");
        Book book2=new Book("gdhhdj","hsgf");

        Librabr lib=new Librabr("Malabe",book1,book2);

        lib.display();
    }
}
