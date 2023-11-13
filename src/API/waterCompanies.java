package API;

import fakeAPI.CompanyAPI;
import fakeAPI.Water1;

public enum waterCompanies {
    WATER1("Water1") {
        @Override
        public CompanyAPI createWaterCompany() {
            return new Water1();
        }
        public String getBill(String crn) {
            CompanyAPI companyAPI = createWaterCompany();
            return companyAPI.CreateBilll(crn);
        }

    };

    private final String waterCompanyName;

    waterCompanies(String waterCompanyName) {
        this.waterCompanyName = waterCompanyName;
    }

    public String getWaterCompanyName() {
        return waterCompanyName;
    }


    public abstract CompanyAPI createWaterCompany();


}
