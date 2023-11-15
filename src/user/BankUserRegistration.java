package user;

import APICallers.Banks;

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
