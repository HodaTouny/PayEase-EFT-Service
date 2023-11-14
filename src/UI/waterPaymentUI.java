package UI;

import API.gasCompanies;
import API.waterCompanies;
import user.User;

import java.util.Scanner;

public class waterPaymentUI extends BillPaymentUI {

    @Override
    public String specificMenu(String crn) {
        System.out.println("1- Water1");
        String CompanyName = scanner.nextLine();

        for (waterCompanies company : waterCompanies.values()) {
            if (company.num.equals(CompanyName)) {
                return company.createBill(crn);
            }
        }
        return null;
    }
}
