package UI;

import APICallers.gasCompanies;

public class gasPaymentUI extends BillPaymentUI {

    @Override
    public String specificMenu(String crn) {
        System.out.println("1- Gas1");
        System.out.println("2- Gas2");
        System.out.print("Please enter the number corresponding to your gas company: ");
        String CompanyName = scanner.nextLine();
        for (gasCompanies company : gasCompanies.values()) {
            if (company.num.equals(CompanyName)) {
                return company.createBill(crn);
            }
        }
        return null;
    }
}
