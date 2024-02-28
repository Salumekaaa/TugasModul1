package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== Library System ======");
        Scanner scanner = new Scanner(System.in);
        boolean login = false;

        do {
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose Option (1-3):");
            int userInput = scanner.nextInt();

            switch (userInput){
                case 1:
                    mahasiswa();
                    break;
                case 2:
                    admin();
                    break;
                case 3:
                    System.out.print("ADIOS");
                    login = true;
                    break;
                default:
                    System.out.println("ERROR!!");
            }
        } while (!login);

    }
    public static void mahasiswa(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your NIM: ");
        String nim = scanner.nextLine();

        if (nim.length() == 15){
            System.out.println("Successful Login as Student");
        } else {
            System.out.println("User Not Found");
        }

    }

    public static void admin(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username (admin): ");
        String username = scanner.nextLine();
        System.out.print("Enter your password (admin): ");
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("admin"))
            System.out.println("Successful Login as Admin");
        else {
            System.out.println("Admin User Not Found!!");
        }

    }
}