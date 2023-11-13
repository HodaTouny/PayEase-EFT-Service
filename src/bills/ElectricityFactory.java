package bills;

import API.ElectricityCompanies;
import API.waterCompanies;

public class ElectricityFactory implements IBillFactory{
    @Override
    public IBill getBill() {
        return ElectricityCompanies.Electricity1;
    }
}
