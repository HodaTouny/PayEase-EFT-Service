package UI;

import bills.BillPaymentManager;
import bills.IBillFactory;
import bills.waterFactory;
import user.User;

import java.util.Scanner;

public class electricityPaymentUI extends BillPaymentUI{
    public electricityPaymentUI(BillPaymentManager paymentManager, User user) {
        super(paymentManager, user);
    }

    @Override
    public String chooseCompany() {
        System.out.println("1-Electricity1");
        System.out.println("2-Electricity2");
        IBillFactory billFactory = new waterFactory();
        Scanner scanner = new Scanner(System.in);
        String choice2 = scanner.nextLine();
        return choice2;
    }

}
