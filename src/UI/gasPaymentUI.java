package UI;

import bills.BillPaymentManager;
import user.User;

import java.util.Scanner;

public class gasPaymentUI extends BillPaymentUI {
    public gasPaymentUI(BillPaymentManager paymentManager, User user) {
        super(paymentManager, user);
    }
    @Override
    public String chooseCompany() {
        System.out.println("1-gas1");
        System.out.println("2-gas2");
        Scanner scanner = new Scanner(System.in);
        String choice2 = scanner.nextLine();
        return choice2;
    }
}
