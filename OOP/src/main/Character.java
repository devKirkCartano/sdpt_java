package main;

public class Character {

    String name, dialogue;
    int hp, mp, level;

    Character(String name, String dialogue, int hp, int mp, int level) {
        this.name = name;
        this.dialogue = dialogue;
        this.hp = hp;
        this.mp = mp;
        this.level = level;
    }

    void introduce() {
        System.out.println("I am " + name + ".");
    }

    void sayDialog() {
        System.out.println( name + ": " + dialogue);
    }

    void talkTo(String firstName) {
        System.out.println(name + ": Hello, " + firstName + "!");
    }

    void talkTo(Character x) {
        System.out.println(name + ": Hello, " + x.name + "!");
    }


}
