package ie.atu.week5;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args)

    {

        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        Store store1 = new Store();
        String name = input.nextLine();
        store1.setName(name);
        System.out.println("You entered: " + name);

        System.out.println("Please enter your email: ");
        String email = input.nextLine();
        store1.setEmail(email);
        System.out.println("You entered: " + store1.getEmail());

        System.out.println("Please enter your details: ");
        String details = input.nextLine();
        store1.setDetail(details);
        System.out.println("You entered: " + store1.getDetail());

        System.out.println("Please enter your name: ");
        String name2 = input.nextLine();
        System.out.println("You entered: " + name2);
        Store store2 = new Store(name2);

        System.out.println("Please enter your email: ");
        String email2 = input.nextLine();
        store2.setEmail(email2);
        System.out.println("You entered: " + email2);

        System.out.println("Please enter your details: ");
        String details2 = input.nextLine();
        store2.setDetail(details2);
        System.out.println("You entered: " + details2);

        String name3 = "", email3 = "",details3 = "";
        System.out.println("Please enter your name: ");
        name3 = input.nextLine();
        System.out.println("You entered: " + name3);

        System.out.println("Please enter your email: ");
        email3 = input.nextLine();
        System.out.println("You entered: " + email3);

        System.out.println("Please enter your details: ");
        details3 = input.nextLine();;
        System.out.println("You entered: " + details3);

        Store store3 = new Store(name3,email3,details3);

        System.out.println("Final Print: ");

        System.out.println("You entered: " + store1.getName());
        System.out.println("You entered: " + store1.getEmail());
        System.out.println("You entered: " + store1.getDetail());

        System.out.println("You entered: " + store2.getName());
        System.out.println("You entered: " + store2.getEmail());
        System.out.println("You entered: " + store2.getDetail());

        System.out.println("You entered: " + store3.getName());
        System.out.println("You entered: " + store3.getEmail());
        System.out.println("You entered: " + store3.getDetail());









    }
}

