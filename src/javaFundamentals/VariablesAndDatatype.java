package javaFundamentals;

public class VariablesAndDatatype {

    public static void main(String[] args) {

        char section = 'A';
        String name = "John Doe";
        boolean isTall = true;
        int age = 20;
        float height = 5.3f; // put f at the end of the number to specify float

        System.out.println(name);

        // Reassigning values
        name = "Jane Doe";
        System.out.println(name);
        isTall = false;

        // Concatenation with + operator, anything added to a string becomes a string
        System.out.println('a' + "b");
        System.out.println(2 + "4");

        System.out.println("I am " + name);
        System.out.println("I am at Section " + section);

        // Sentence Builder Challenge
        String name1 = "Juana Dela Cruz";
        int age1 = 20;
        double gpa = 1.0;
        char bloodType = 'O';

        System.out.println("Hi! my name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("My GPA is " + gpa);
        System.out.println("My blood type is " + bloodType);
    }
}
