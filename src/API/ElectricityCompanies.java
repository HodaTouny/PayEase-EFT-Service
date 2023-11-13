package API;

import bills.IBill;
import fakeAPI.CompanyAPI;
import fakeAPI.Electricity1;

public enum ElectricityCompanies implements IBill {
    Electricity1("Electricity1") {
        @Override
        public CompanyAPI createElectricityCompany() {
            return new Electricity1();
        }
    };
    public String createBill(String crn) {
        CompanyAPI companyAPI = createElectricityCompany();
        return companyAPI.CreateBilll(crn);
    }


    private final String ElectricityCompanyName;

    ElectricityCompanies(String ElectricityCompanyName) {
        this.ElectricityCompanyName = ElectricityCompanyName;
    }

    public String getElectricityCompanyName() {
        return ElectricityCompanyName;
    }

    public abstract CompanyAPI createElectricityCompany();


}
