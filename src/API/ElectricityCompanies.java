package API;

import fakeAPI.CompanyAPI;
import fakeAPI.Electricity1;

public enum ElectricityCompanies {
    Electricity1("Electricity1") {
        @Override
        public CompanyAPI createElectricityCompany() {
            return new Electricity1();
        }
    };

    private final String ElectricityCompanyName;

    ElectricityCompanies(String ElectricityCompanyName) {
        this.ElectricityCompanyName = ElectricityCompanyName;
    }

    public String getElectricityCompanyName() {
        return ElectricityCompanyName;
    }

    public abstract CompanyAPI createElectricityCompany();


}
