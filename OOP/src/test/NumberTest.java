package test;

public class NumberTest {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        Number n3 = new Number(500);
        Number n4 = new Number(600);
        System.out.println(" First Number: " +n1.getNum());
        System.out.println(" Second Number: " +n2.getNum());
        System.out.println(" Third Number: " +n3.getNum());
        System.out.println(" Fourth Number: " +n4.getNum());
    }
}

