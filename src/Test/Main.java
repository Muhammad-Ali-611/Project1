package Test;

import OnlineCourior.User;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            DBConnection db = new DBConnection();

            System.out.println("1. Register\n2. Login\nEnter choice:");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("Enter username:");
                String username = sc.nextLine();
                System.out.println("Enter password:");
                String password = sc.nextLine();
                System.out.println("Enter email:");
                String email = sc.nextLine();
                System.out.println("Enter address:");
                String address = sc.nextLine();

                User user = new User();
                user.setUsername(username);
                user.setPassword(password);
                user.setEmail(email);
                user.setAddress(address);

                db.registerUser(user);
            } else if (choice == 2) {
                System.out.println("Enter username:");
                String username = sc.nextLine();
                System.out.println("Enter password:");
                String password = sc.nextLine();

                if (db.loginUser(username, password)) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Invalid credentials.");
                }
            }
        }
    }


