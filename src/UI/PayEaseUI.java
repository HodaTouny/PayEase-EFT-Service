package UI;

import database.Database;
import database.IDatabase;
import inquery.BalanceInquire;
import inquery.InquireFactory;
import inquery.inquireFactoryConcrete;
import transfer.TransferManager;
import user.*;

import java.util.Scanner;

import static java.lang.System.exit;

public class PayEaseUI {
    String [] LoggedUser;
    User user;
    IDatabase database = new Database();
    private final Scanner scanner;

    public PayEaseUI() {
        this.scanner = new Scanner(System.in);
    }

    public void payEaseMenu() {
        boolean toContinue = false;

        System.out.println("Greetings from PayEase – Your Gateway to Effortless Financial Management!");
        System.out.println("1. New User? Let's get you registered.");
        System.out.println("2. Returning User? Welcome back! Please log in.");

        System.out.print("To proceed, enter the number corresponding to your choice (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        if (choice == 1) {
            handleRegistration();
        }
        toContinue = handleLogin();
        if (toContinue) {
            int choice2 = 0;
            while (choice2 != 4) {
                System.out.println("Welcome back, " + LoggedUser[0] + "!");
                System.out.println("How may we assist you today?");
                System.out.println("1. Transfer Money");
                System.out.println("2. Pay Bills");
                System.out.println("3. inquire balance");
                System.out.println("4. Exit");
                System.out.print("Please choose an option (1, 2, or 3): ");
                choice2 = scanner.nextInt();
                scanner.nextLine();
                switch (choice2) {
                    case 1:
                        handleTransferMoney();
                        break;
                    case 2:
                        handleBillPayment();
                        break;
                    case 3:
                        handleBalanceQuery();
                        break;
                    case 4:
                        System.out.println("Thank you for using PayEase. Have a great day!");
                        break;
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            }
        }
    }



    private boolean handleLogin()
    {
        LoginUIFactory factory = new LoginUIFactoryConcrete();
        LoginUI loginUI = factory.createLoginUI(1);
         user = loginUI.loginMenu(database);
        if (user != null) {
            LoggedUser = user.getData().split(",");
            return true;

        }
        System.out.println("Login failed. Invalid username or password.");
        return false;
    }

    private boolean handleRegistration() {
        System.out.println("1. Wallet Registration");
        System.out.println("2. Bank Registration");
        System.out.print("Choose registration type (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        RegistartionUiFactory factory = new ConcreteRegistartionUIFactory();
        RegistrationUI registrationUI = factory.createReg(choice);
        if(!registrationUI.registrationTemplate(choice,database)){
            exit(0);
        }
        return true;
    }

    private void handleBillPayment(){
        System.out.println("1. Electricity");
        System.out.println("2. Gas");
        System.out.println("3. Water");
        System.out.print("Please enter the number corresponding to the Bill You need To Pay: ");
        String billType = scanner.nextLine();
        BillsFactoryUI factory = new BillsFactoryUiConcrete();
        BillPaymentUI bill = factory.create(billType);
        bill.BillTemplate(LoggedUser,bill);
    }

    public void handleTransferMoney() {
        System.out.println("1. Transfer to Wallet");
        System.out.println("2. Transfer to PayEase Account");
        if (LoggedUser[4].equals("bank")) {
            System.out.println("3. Transfer to Bank Account");
        }

        System.out.print("Please enter the number corresponding to the transfer you want to make: ");
        Scanner scanner = new Scanner(System.in);
        String transferType = scanner.nextLine();
        TransferManager manager = new TransferManager();
        TransfersUIFactory factory = new TransfersUIFactoryConcrete();
        TransferUI transferUI = factory.create(transferType, manager);
        transferUI.handleTransfer(transferType,LoggedUser,transferUI);
        System.out.println();

    }
    public void handleBalanceQuery() {
        InquireFactory InquireFactory = new inquireFactoryConcrete();
        BalanceInquire balanceInquire = InquireFactory.create(LoggedUser[4]);
        if (balanceInquire != null) {
            double balance = balanceInquire.getBalance(LoggedUser[3]);
            System.out.println("Your current balance is: " + balance);
        } else {
            System.out.println("Invalid user type for balance inquiry.");
        }
        System.out.println();
    }

}




