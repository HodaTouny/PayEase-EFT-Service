package API;

import bills.IBill;
import fakeAPI.CompanyAPI;
import fakeAPI.Electricity1;

public enum ElectricityCompanies implements IBill {
    Electricity1("1") {
        @Override
        public CompanyAPI createElectricityCompany() {
            return new Electricity1();
        }
    };
    public String createBill(String crn) {
        CompanyAPI companyAPI = createElectricityCompany();
        return companyAPI.CreateBilll(crn);
    }
    String num;
    ElectricityCompanies(String num) {
        this.num = num;
    }



    public abstract CompanyAPI createElectricityCompany();


}
