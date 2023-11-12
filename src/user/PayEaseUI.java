package user;

import java.util.Scanner;

public class PayEaseUI {
    private RegistrationUI registrationUI;
    private LoginUI loginUI;
    private Scanner scanner;

    public PayEaseUI() {
       // this.registrationUI = new RegistrationUI();
        this.scanner = new Scanner(System.in);
    }

    public void payEaseMenu() {
        System.out.println("Welcome to PayEase!");
        int choice;
            System.out.println("1) Register");
            System.out.println("2) Login");
            System.out.println("3) Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
                switch (choice) {
                    case 1:
                       // registrationUI.registrationMenu();

                        break;
                    case 2:
                        loginUI.loginMenu();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }

    }

