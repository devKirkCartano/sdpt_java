package javaFundamentals;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5}; // declaring and initializing array of size 5

        String[] names = new String[5]; // declaring empty array of size 5

        int[] evenNumbers = new int[20];

        System.out.println(numbers[0]);
        numbers[0] = 24;
        System.out.println(numbers[4]);
        System.out.println(numbers[0]);

        Scanner scan = new Scanner(System.in);
        // System.out.print("Enter name: ");
        // names[0] = scan.nextLine();
        //System.out.println(names[0]);

        // Accessing paired by index
        String[] email = {"email1@gmail.com", "email2@gmail.com", "email3@gmail.com", "email4@gmail.com", "email5@gmail.com"};
        String[] username = {"user1", "user2", "user3", "user4", "user5"};
        String[] password = {"pass1", "pass2", "pass3", "pass4", "pass5"};

        int index = 4;

        System.out.println("Index: " + index);
        System.out.println("Email: " + email[index]);
        System.out.println("Username: " + username[index]);
        System.out.println("Password: " + password[index]);

    }
}
