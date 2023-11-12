package user;

import API.Banks;
import fakeAPI.BankAPI;

import java.util.Scanner;

public class BankUserRegistration extends Registration{
    public boolean APIVerification(String creditCardNumber,String phone) {
        for (Banks bank : Banks.values()) {
            if (bank.APIVerification(creditCardNumber,phone)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void register() {
        System.out.print("Enter your credit card number:");
        Scanner scanner = null;
        String cardNum = scanner.nextLine();
    }


}
