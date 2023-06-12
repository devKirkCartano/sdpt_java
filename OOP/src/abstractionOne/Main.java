package abstractionOne;

public class Main {

    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();

        d.makeSound();
        c.makeSound();

        d.setName("Shoeshine");
        c.setName("Kitty");

        d.showName();
        c.showName();

    }
}
