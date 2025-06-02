package Abstract.Ani;

public class Main {
    public static void main(String[] args) {
        Animal an=new Dog();
        an.eat();
        an.makeSound();

        System.out.println();
        Animal cat=new Cat();
        cat.eat();
        cat.makeSound();

    }
}
