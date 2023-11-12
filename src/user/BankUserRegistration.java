package user;

import API.Banks;
import fakeAPI.BankAPI;

public class BankUserRegistration extends Registration{
    public boolean APIVerification(String creditCardNumber,String phone) {
        for (Banks bank : Banks.values()) {
            if (bank.APIVerification(creditCardNumber,phone)) {
                return true;
            }
        }
        return false;
    }


}
