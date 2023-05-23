package main;
import java.util.Scanner;
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

        Scanner s = new Scanner(System.in);

        Product product = new Product("Milk", 100); // creating an object of type Product
        System.out.print("Name: ");
        product.name = s.nextLine(); // alternative input method

        System.out.print("Price: ");
        product.price = s.nextFloat();
        System.out.println(product.name + " costs " + product.price);
    }
}
