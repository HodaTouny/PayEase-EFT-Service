package transfer;

import API.Wallets;
import user.*;
import user.WalletUser;
import API.*;

public class WalletTransfer extends Transfer {

    @Override
    public boolean transfer(double amount, String[] restData, User user) {
        for (Wallets wallet : Wallets.values()) {
            if (wallet.APIVerification(restData[0], restData[1]) && (user.getPhone() != restData[1])) {
                if (user.getUserType()== "wallet"){
                    if (walletWithdraw(amount, user)){
                        wallet.deposit(restData[1], amount);
                        return true;
                    }
                }else if (user.getUserType()== "bank"){
                    if (bankWithdraw(amount, user)){
                        wallet.deposit(restData[1], amount);
                        return true;
                    }

                }
            }else{
            System.out.println("Receiver's wallet is not valid");
            return false;}
        }
        return false;
    }

}
