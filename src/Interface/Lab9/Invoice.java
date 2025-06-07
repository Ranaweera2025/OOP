package Interface.Lab9;

public class Invoice implements Printable{

    private String invoiceId;
    private double amount;

    public Invoice(String invoiceId, double amount) {
        this.invoiceId = invoiceId;
        this.amount = amount;
    }

    @Override
    public void diplay() {
        System.out.println("Printing invoice----------------");
        System.out.println("ID : "+invoiceId);
        System.out.println("Amount : "+amount);
    }
}
