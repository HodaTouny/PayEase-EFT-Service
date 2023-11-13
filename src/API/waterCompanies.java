package API;

import bills.IBill;
import fakeAPI.CompanyAPI;
import fakeAPI.Water1;

public enum waterCompanies implements IBill {
    WATER1("1000", "5000") {

        @Override
        public CompanyAPI createCompany() {
            return new Water1();
        }

    };
    public String createBill(String crn) {
        CompanyAPI companyAPI = createCompany();
        return companyAPI.CreateBilll(crn);
    }


    private  String startRange;
    private  String endRange;

    waterCompanies(String startRange, String endRange) {
        this.startRange = startRange;
        this.endRange = endRange;
    }
    waterCompanies(){};

    public boolean isInRange(String crn) {
        int intValue = Integer.parseInt(crn);
        int startValue = Integer.parseInt(startRange);
        int endValue = Integer.parseInt(endRange);

        return intValue >= startValue && intValue <= endValue;
    }

    public abstract CompanyAPI createCompany();

}

