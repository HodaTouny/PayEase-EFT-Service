package UI;

import bills.BillPaymentManager;
import user.User;

import java.util.Scanner;

public class waterPaymentUI extends BillPaymentUI {
    public waterPaymentUI(BillPaymentManager paymentManager, User user) {
        super(paymentManager, user);
    }
    @Override
    public String chooseCompany() {
        System.out.println("1-water1");
        System.out.println("2-water2");
        Scanner scanner = new Scanner(System.in);
        String choice2 = scanner.nextLine();
        return choice2;
    }
}
