package abstractionTwo;

public class Main {

    public static void main(String[] args) {
//        Abstract idea
//        Animal a = new Animal();
        Dog d = new Dog();
        Bird b = new Bird();
        Frog f = new Frog();

        d.makeSound();
        b.makeSound();
        f.makeSound();
    }
}
