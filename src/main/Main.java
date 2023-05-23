package main;

import mathematics.Arithmetic;
import mathematics.Constants;

public class Main {

    public static void main(String[] args) {

/*
        Arithmetic a = new Arithmetic(); // instantiating a class
        Constants c = new Constants();

        int sum = a.add(10, 20);

        System.out.println(sum);
        int product = a.multiply(10, 20);
        System.out.println(product);
        System.out.println(c.pi); // instance reference method
        a.printPi();
*/
        System.out.println(Arithmetic.add(10,20)); // static reference method
        Arithmetic.printPi();
        System.out.println(Constants.pi); // static reference variable

    }
}
