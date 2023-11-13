package bills;

import API.ElectricityCompanies;
import API.waterCompanies;

public class ElectricityFactory implements IBillFactory{
    private ElectricityCompanies electricityCompany;

    public ElectricityFactory() {
        this.electricityCompany = electricityCompany;
    }

    @Override
    public String getBillDetails(String num, String crn) {
        if (num.equals("1")) {

            return electricityCompany.Electricity1.createBill(crn);
        }
        return null;
    }
}
