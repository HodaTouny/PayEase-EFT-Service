package UI;

import API.gasCompanies;

public class gasPaymentUI extends BillPaymentUI {

    @Override
    public String specificMenu(String crn) {
        System.out.println("1-Gas1");

        String CompanyName = scanner.nextLine();
        for (gasCompanies company : gasCompanies.values()) {
            if (company.num.equals(CompanyName)) {
                return company.createBill(crn);
            }
        }
        return null;
    }
}
