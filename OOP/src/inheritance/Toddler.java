package inheritance;

public class Toddler extends Person {

    String favoriteToy;

    Toddler() {

    }

    Toddler(String name, String sex, int age, String favoriteToy) {
            super(name,sex,age);
            this.favoriteToy = favoriteToy;
    }


    void drink() {
        System.out.println( name + " is  Drinking milk");
    }

    void checkStatus() {
        super.checkStatus();
        System.out.println("Favorite toy: " + favoriteToy);
    }

}
