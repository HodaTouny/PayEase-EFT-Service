package transfer;

import user.*;
import API.*;

public class BankTransfer extends Transfer {

    @Override
    public boolean transfer(double amount, String[] restData, User user) {
        for (Banks bank : Banks.values()) {
            if (bank.APIVerification(restData[1]) && (((BankUser) user).getCardNumber() != restData[1])) {
                if (bankWithdraw(amount, user)) {
                    bank.deposit(restData[1], amount);
                    return true;
                }
            }else{System.out.println("Receiver's bank account is not valid");
            return false;}
        }return false;
    }
}
