package javaFundamentals;

import java.util.Scanner;

public class InputAndArithmeticOperators {

    public static void main(String[] args) {

        float numOne;
        float numTwo;
        Scanner scan = new Scanner(System.in);

        // Simple Calculator
        System.out.print("Num1: ");
        numOne = scan.nextFloat();
        System.out.print("Num2: ");
        numTwo = scan.nextFloat();

        float result = numOne / numTwo;
        System.out.println(numOne + " / "  + numTwo + " = " + result);
    }
}
