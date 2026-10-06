package program1;

import java.util.Scanner;

public class bank1 {

    public static void main(String[] args) {

        Scanner var = new Scanner(System.in);

        int n;

        do {
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("4. EXIT");

            System.out.print("Enter your choice: ");
            n = var.nextInt();

            switch (n) {

            case 1:

                char choice;

                do {
                    System.out.print("Enter your name: ");
                    String name = var.next();

                    System.out.print("Enter your age: ");
                    int age = var.nextInt();

                    System.out.println("Name = " + name);
                    System.out.println("Age = " + age);

                    System.out.print("Do you want to continue? (y/n): ");
                    choice = var.next().charAt(0);

                } while (choice == 'y' || choice == 'Y');

                break;

            case 2:
                System.out.println("Display");
                break;

            case 3:
                System.out.println("Raise Salary");
                break;

            case 4:
                System.out.println("Thank you! Exiting...");
                break;

            default:
                System.out.println("Invalid choice");
            }

        } while (n != 4);

        var.close();
    }
}