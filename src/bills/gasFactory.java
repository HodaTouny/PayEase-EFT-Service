package bills;

import API.gasCompanies;
import API.waterCompanies;

public class gasFactory implements IBillFactory{
    @Override
    public IBill getBill() {
        return gasCompanies.Gas1;
    }
}
