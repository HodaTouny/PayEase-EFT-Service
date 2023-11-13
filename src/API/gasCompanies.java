package API;

import bills.IBill;
import fakeAPI.CompanyAPI;

import fakeAPI.Water1;

public enum gasCompanies implements IBill {
    Gas1("1") {
        @Override
        public CompanyAPI createGasCompany() {
            return new Water1();
        }
    };
    public String createBill(String crn) {
        CompanyAPI companyAPI = createGasCompany();
        return companyAPI.CreateBilll(crn);
    }

    String num;
    gasCompanies(String num) {
        this.num = num;
    }


    public abstract CompanyAPI createGasCompany();


}
