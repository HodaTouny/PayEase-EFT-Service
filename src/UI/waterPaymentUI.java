package UI;

import API.waterCompanies;

public class waterPaymentUI extends BillPaymentUI {

    @Override
    public String specificMenu(String crn) {
        System.out.println("1- Water1");
        System.out.println("2- Water2");
        System.out.print("Please enter the number corresponding to your Water company: ");
        String CompanyName = scanner.nextLine();

        for (waterCompanies company : waterCompanies.values()) {
            if (company.num.equals(CompanyName)) {
                return company.createBill(crn);
            }
        }
        return null;
    }
}
