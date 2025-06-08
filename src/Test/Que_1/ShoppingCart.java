package Test.Que_1;

public class ShoppingCart {
    public static void main(String[] args) {
        Product pr=new Product();
        pr.displaydetails();
        System.out.println();

        Electronics el=new Electronics(23,"trouser",5000,"deedat");
        el.displaydetails();
        System.out.println();

        Clothing clo=new Clothing(45,"Frock",2500,"Medium","Red");
        clo.displaydetails();

    }
}
