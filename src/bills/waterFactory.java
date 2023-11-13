package bills;

import API.ElectricityCompanies;
import API.waterCompanies;
import fakeAPI.CompanyAPI;

public class waterFactory implements IBillFactory{

    @Override
    public IBill getBill() {
        return waterCompanies.WATER1;
    }
}

