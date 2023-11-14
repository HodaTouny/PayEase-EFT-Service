package UI;

import API.ElectricityCompanies;

public class electricityPaymentUI extends BillPaymentUI{


    @Override
    public String specificMenu(String crn) {
        System.out.println("1- Electricity");

        String CompanyName = scanner.nextLine();
        for (ElectricityCompanies company : ElectricityCompanies.values()) {
            if (company.num.equals(CompanyName)) {
                return company.createBill(crn);
            }
        }
        return null;
    }
}
