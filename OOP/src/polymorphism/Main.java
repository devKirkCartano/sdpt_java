package polymorphism;

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        d.makeSound();
        c.makeSound();

        Animal a = new Dog();
        Animal b = new Cat();

        a.makeSound();
        b.makeSound();


        Enemy we = new WeakEnemy();
        Enemy se = new StrongEnemy("David");


        we.dialog();
        se.dialog();

        we.showStats();
        we.dialog();
        se.showStats();
        se.dialog();
    }
}
