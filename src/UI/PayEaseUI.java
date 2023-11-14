package UI;

import user.*;

import java.util.Scanner;

public class PayEaseUI {
    String [] LoggedUser;

    private Scanner scanner;

    public PayEaseUI() {
        this.scanner = new Scanner(System.in);
    }

    public void payEaseMenu() {
        System.out.println("Welcome to PayEase!");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("Choose an option (1 or 2): ");

//        int choice = scanner.nextInt();
//        scanner.nextLine();
//
//        switch (choice) {
//            case 1:
//                handleLogin();
//                break;
//            case 2:
//                handleRegistration();
//                break;
//            default:
//                System.out.println("Invalid choice. Please choose 1 or 2.");
//        }
        handleLogin();
        handleBillPayment();

    }

    private void handleLogin()
    {
        LoginFactory factory = new ConcreteLoginFactory();
        LoginUI loginUI = factory.createLogin(1);
        User user = loginUI.loginMenu();
        if (user != null) {
            LoggedUser = user.getData().split(",");
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

    private void handleBillPayment(){
        System.out.println("Select bill type:");
        System.out.println("1. Electricity");
        System.out.println("2. Gas");
        System.out.println("3. Water");
        String billType = scanner.nextLine();
        BillsFactoryUI factory = new BillsFactoryUiConcrete();
        BillPaymentUI bill = factory.create(billType);
        bill.BillTemplate(LoggedUser,bill);
    }
}

