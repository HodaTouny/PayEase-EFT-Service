package APICallers;

import bills.IBill;
import fakeAPI.CompanyAPI;

import fakeAPI.Gas1;
import fakeAPI.Gas2;

public enum gasCompanies implements IBill {
    Gas1("1") {
        @Override
        public CompanyAPI createGasCompany() {
            return new Gas1();
        }
    }, Gas2("2") {
        @Override
        public CompanyAPI createGasCompany() {return new Gas2();}
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
