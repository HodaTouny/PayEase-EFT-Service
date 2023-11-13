package bills;

import java.util.Scanner;

public class BillPaymentInterface {
    private final BillPaymentManager paymentManager;
    private  WithdrawalStrategy withdrawalStrategy;

    public BillPaymentInterface(BillPaymentManager paymentManager) {
        this.paymentManager = paymentManager;
    }
    public void showmenu() {
        System.out.println("which bill you want to pay");
        System.out.println("1-Water Bill");
        System.out.println("2-Electricity Bill");
        System.out.println("3-Gas Bill");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
        }
    }


}
