package UI;

import APICallers.ElectricityCompanies;

public class electricityPaymentUI extends BillPaymentUI{


    @Override
    public String specificMenu(String crn) {
        System.out.println("1- Electricity");
        System.out.println("1- Electricity ");
        System.out.print("Please enter the number corresponding to your Electricity company: ");
        String CompanyName = scanner.nextLine();
        for (ElectricityCompanies company : ElectricityCompanies.values()) {
            if (company.num.equals(CompanyName)) {
                return company.createBill(crn);
            }
        }
        return null;
    }
}
