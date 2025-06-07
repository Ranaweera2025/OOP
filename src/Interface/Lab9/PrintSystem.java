package Interface.Lab9;

public class PrintSystem {
    public static void main(String[] args) {

        Report report1 = new Report("Annual Report 2024", "Alice");
        Report report2 = new Report("Marketing Strategy", "Bob");

        Invoice invoice1 = new Invoice("INV1001", 4500.75);
        Invoice invoice2 = new Invoice("INV1002", 2300.00);


        Printable[] printItems = { report1, report2, invoice1, invoice2 };


        for (Printable item : printItems) {
            item.diplay();
        }
    }
}
