package user;

import java.util.Scanner;

public class PayEaseUI {

    private Scanner scanner;

    public PayEaseUI() {
        this.scanner = new Scanner(System.in);
    }

    public void payEaseMenu() {
        System.out.println("Welcome to PayEase!");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("Choose an option (1 or 2): ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                handleLogin();
                break;
            case 2:
                handleRegistration();
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
    }

    private void handleLogin()
    {
        LoginFactory factory = new ConcreteLoginFactory();
        LoginUI loginUI = factory.createLogin(1);
        boolean loginResult = loginUI.loginMenu();
        if (loginResult) {
            System.out.println("Login successful!");

        } else {
            System.out.println("Login failed. Invalid username or password.");
        }
    }

    private void handleRegistration() {
        System.out.println("1. Wallet Registration");
        System.out.println("2. Bank Registration");
        System.out.print("Choose registration type (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        RegistartionUiFactory factory = new ConcreteRegistartionUIFactory();
        RegistrationUI registrationUI = factory.createReg(choice);
        registrationUI.registrationTemplate(choice);

    }
}

