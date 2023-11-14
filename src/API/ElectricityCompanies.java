package API;

import bills.IBill;
import fakeAPI.CompanyAPI;
import fakeAPI.Electricity1;
import fakeAPI.Electricity2;

public enum ElectricityCompanies implements IBill {
    Electricity1("1") {
        @Override
        public CompanyAPI createElectricityCompany() {
            return new Electricity1();
        }
    },
    Electricity2 ("2") {
        @Override
        public CompanyAPI createElectricityCompany() {
            return new Electricity2();
        }
    };
    public String createBill(String crn) {
        CompanyAPI companyAPI = createElectricityCompany();
        return companyAPI.CreateBilll(crn);
    }
    public String num;
    ElectricityCompanies(String num) {
        this.num = num;
    }



    public abstract CompanyAPI createElectricityCompany();


}
