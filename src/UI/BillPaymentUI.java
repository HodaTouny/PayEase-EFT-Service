package UI;

import bills.BillPaymentManager;
import bills.WithdrawalStrategy;
import bills.bankWithdrawalStrategy;
import user.User;

import java.util.Scanner;

public  abstract class BillPaymentUI{
    private final BillPaymentManager paymentManager;
    private final User user;


    public BillPaymentUI(BillPaymentManager paymentManager, User user) {
        this.paymentManager = paymentManager;
        this.user = user;
    }

    public void showmenu(String userData[]) {
        System.out.println("Which bill do you want to pay?");
        System.out.println("1-Water Bill");
        System.out.println("2-Electricity Bill");
        System.out.println("3-Gas Bill");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        String mychoice = chooseCompany();
        System.out.println("Enter CRN:");
        String crn = scanner.nextLine();
        paymentManager.generateBill(crn,mychoice);
        System.out.println("Do you want to pay? (yes/no)");
        String payOption = scanner.next();
        if ("yes".equals(payOption)) {
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
    public abstract String chooseCompany();
}
