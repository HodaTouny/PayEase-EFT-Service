package API;

import bills.IBill;
import fakeAPI.CompanyAPI;

import fakeAPI.Gas1;
import fakeAPI.Water1;

public enum gasCompanies implements IBill {
    Gas1("1") {
        @Override
        public CompanyAPI createGasCompany() {
            return new Gas1();
        }
    };
    public String createBill(String crn) {
        CompanyAPI companyAPI = createGasCompany();
        return companyAPI.CreateBilll(crn);
    }

    public String num;
    gasCompanies(String num) {
        this.num = num;
    }


    public abstract CompanyAPI createGasCompany();


}
