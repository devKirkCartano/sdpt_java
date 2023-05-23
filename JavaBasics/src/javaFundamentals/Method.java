package javaFundamentals;

import java.util.Stack;

public class Method {

    // Global variable
    static String name = "James"; // needs to be static to be used in static method, kapag global need laging static


    public static void main(String[] args) {
        sayHello();
        System.out.println("Hello " + name);
        System.out.println(add(5, 2));
        System.out.println(add(5, 2, 3));
        System.out.println(add(5.5, 2.1));

        // Summation Challenge
        int[] numbers = {1, 2, 3, 4, 5};
        int result = summation(numbers);
        System.out.println(result);
    }


    static void sayHello() {
        String name = "Kirk";  // Local variable
        System.out.println("Hello " + name);
    }

    // Method Overloading
    static int add (int num1, int num2) {
        return num1 + num2;
    }

    static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Summation Challenge
    static int summation(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
