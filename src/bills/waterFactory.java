package bills;

import API.waterCompanies;

public class waterFactory implements IBillFactory {

    private waterCompanies waterCompany;

    public waterFactory() {
        this.waterCompany = waterCompany;
    }

    @Override
    public String getBillDetails(String num,String crn) {
        if (num.equals("1")) {
            return waterCompany.WATER1.createBill(crn);
        }
        else if(num.equals("2")){
            return waterCompany.WATER2.createBill(crn);
        }
        return null;
    }

}
