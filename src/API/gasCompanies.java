package API;

import bills.IBill;
import fakeAPI.CompanyAPI;
import fakeAPI.Wallet1;
import fakeAPI.WalletAPI;
import fakeAPI.Water1;

public enum gasCompanies implements IBill {
    Gas1("Gas1") {
        @Override
        public CompanyAPI createGasCompany() {
            return new Water1();
        }
    };
    public String createBill(String crn) {
        CompanyAPI companyAPI = createGasCompany();
        return companyAPI.CreateBilll(crn);
    }

    private final String gasCompanyName;

    gasCompanies(String gasCompanyName) {
        this.gasCompanyName = gasCompanyName;
    }

    public String getGasCompanyName() {
        return gasCompanyName;
    }

    public abstract CompanyAPI createGasCompany();


}
