package transfer;

import fakeAPI.Bank1;
import fakeAPI.BankAPI;
import fakeAPI.Wallet1;
import fakeAPI.WalletAPI;
import user.BankUser;
import user.User;
import user.WalletUser;

public class WalletTransfer implements Transfer {

    @Override
    public boolean transfer(double amount, String[] restData, User user) {
        BankAPI bankAPI = new Bank1();
        WalletAPI walletAPI = new Wallet1();
        if (checkAccount(restData, user)) {
            if(user instanceof BankUser){
                BankUser bankUser = (BankUser) user;
                if (bankAPI.withdraw(bankUser.getCardNumber(), amount) && walletAPI.deposit(restData[1], amount)) {
                    return true;
                }
            }else if(user instanceof WalletUser){
                if (walletAPI.withdraw(user.getPhone(), amount) && walletAPI.deposit(restData[1], amount)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean checkAccount(String[] restData, User user) {
        WalletAPI walletAPI = new Wallet1();
        if (walletAPI.verifyUser(restData[0],restData[1]) && (!restData[1].equals(user.getPhone()))) {
            return true;
        }
        System.out.println("Invalid account");
        return false;
    }
}
