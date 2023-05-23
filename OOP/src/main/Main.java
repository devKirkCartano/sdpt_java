package main;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

//        Person p = new Person(); // instantiating an object of type Person
//        p.firstName = "John";
//        p.lastName = "Doe";
//        p.sex = 'M';
//        p.age = 30;

//        Person p1 = new Person(); // instantiating an object of type Person
//        p1.firstName = "Jane";
//        p1.lastName = "Doe";
//        p1.sex = 'F';
//        p1.age = 29;

//        System.out.println(p.firstName + " " + p.lastName + " is " + p.age + " years old.");
//        System.out.println(p1.firstName + " " + p1.lastName + " is " + p1.age + " years old.");

//        Scanner s = new Scanner(System.in);

//        Product product = new Product("Milk", 100); // creating an object of type Product
//        System.out.print("Name: ");

//        System.out.print("Price: ");
//        product.price = s.nextFloat();
//        System.out.println(product.name + " costs " + product.price);

        Character c = new Character("John", "Hello", 100, 50, 5);
        Character c1 = new Character("Jane", "Hi", 60, 50, 1);

//        c.introduce();
//        c.sayDialog();
//        c.talkTo("Kirk");
//        c.talkTo(c1);

        Student s1 = new Student("Jarvis", "Doe", "Senior", "BSIT", 'A', 89.56, 90.78);
        s1.introduceSelf();
        System.out.println();
        s1.evaluateGrade();
    }
}
