package Interface.Printable;

public class Main {
    public static void main(String[] args) {
        Printable em=new Employee("saman",2416,"IT");
        em.printdetails();
        System.out.println();

        Printable book=new Book("ABC","sam",1234);
        book.printdetails();
    }
}
