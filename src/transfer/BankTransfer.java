package transfer;

import fakeAPI.*;
import user.*;


public class BankTransfer implements Transfer {

    @Override
    public boolean transfer(double amount, String[] restData, User user) {
        BankAPI bankAPI = new Bank1();
        if (checkAccount(restData, user)) {
            BankUser bankUser = (BankUser) user;
            if (bankAPI.withdraw(bankUser.getCardNumber(), amount) && bankAPI.deposit(restData[1], amount)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkAccount(String[] restData, User user) {
        BankAPI bankAPI = new Bank1();
        BankUser bankUser = (BankUser) user;
        if (bankAPI.findUser(restData[1]) && (restData[1]!= bankUser.getCardNumber())) {
            return true;
        }
        System.out.println("Invalid account");
        return false;
    }
}
