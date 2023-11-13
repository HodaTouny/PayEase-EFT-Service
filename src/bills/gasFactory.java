package bills;

import API.ElectricityCompanies;
import API.gasCompanies;
import API.waterCompanies;

public class gasFactory implements IBillFactory {
    private gasCompanies gasCompany;

    public gasFactory() {
        this.gasCompany = gasCompany;
    }


    @Override
    public String getBillDetails(String num, String crn) {
        if (num.equals("1")) {

            return gasCompany.Gas1.createBill(crn);
        }
        return null;
    }
}
