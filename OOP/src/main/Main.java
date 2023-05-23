package main;

public class Main {

    public static void main(String[] args) {

        Person p = new Person(); // instantiating an object of type Person
        p.firstName = "John";
        p.lastName = "Doe";
        p.sex = 'M';
        p.age = 30;

        Person p1 = new Person(); // instantiating an object of type Person
        p1.firstName = "Jane";
        p1.lastName = "Doe";
        p1.sex = 'F';
        p1.age = 29;


        System.out.println(p.firstName + " " + p.lastName + " is " + p.age + " years old.");
        System.out.println(p1.firstName + " " + p1.lastName + " is " + p1.age + " years old.");
    }
}
