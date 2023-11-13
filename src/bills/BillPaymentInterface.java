package bills;

import user.User;

import java.util.Scanner;

public class BillPaymentInterface {
    private final BillPaymentManager paymentManager;
    private final User user;

    public BillPaymentInterface(BillPaymentManager paymentManager, User user) {
        this.paymentManager = paymentManager;
        this.user = user;
    }

    public void showmenu() {
        System.out.println("Which bill do you want to pay?");
        System.out.println("1-Water Bill");
        System.out.println("2-Electricity Bill");
        System.out.println("3-Gas Bill");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.println("1-water1");
                System.out.println("2-water2");
                break;
            case 2:
                System.out.println("1-Electricity1");
                System.out.println("2-Electricity2");
                break;
            case 3:
                System.out.println("1-gas1");
                System.out.println("2-gas2");
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
                return;
        }
        System.out.println("what is your company number");

        String choice2 = scanner.nextLine();
        System.out.println("Enter CRN:");
        String crn = scanner.nextLine();
        paymentManager.generateBill(crn, choice,choice2);

        System.out.println("Do you want to pay? (yes/no)");
        String payOption = scanner.next();
        if ("yes".equalsIgnoreCase(payOption)) {
            double paymentAmount = paymentManager.getBillAmount();
            boolean paymentResult = paymentManager.performPayment(user, paymentAmount);
            if (paymentResult) {
                System.out.println("Payment successful!");
            } else {
                System.out.println("Payment failed. Insufficient funds.");
            }
        } else {
            System.out.println("Payment canceled.");
        }
    }
}
