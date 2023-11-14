package API;

import bills.IBill;
import fakeAPI.CompanyAPI;
import fakeAPI.Water1;
import fakeAPI.Water2;

public enum waterCompanies implements IBill {
    WATER1("1") {
        @Override
        public CompanyAPI createCompany() {
            return new Water1();
        }
    },
    WATER2("2") {
        @Override
        public CompanyAPI createCompany() {
            return new Water2();
        }
    };

    public String num;
    waterCompanies(String num) {
        this.num = num;
    }



    public String createBill(String crn) {
        CompanyAPI companyAPI = createCompany();
        return companyAPI.CreateBilll(crn);
    }



    public abstract CompanyAPI createCompany();
}
