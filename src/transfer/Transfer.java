package transfer;
import API.*;
import user.*;

public abstract class Transfer {
    public  abstract boolean transfer(double amount, String[] restData, String[] user);
    public boolean bankWithdraw(double amount, String[] user){
        for (Banks bank : Banks.values()) {
            if (bank.APIVerification(user[5])) {
                if (bank.withdraw(user[5], amount)) {
                    return true;
                }
            }else {System.out.println("Your bank account is not valid");
            return false;}
        }return false;
    }
    public boolean walletWithdraw(double amount, String[] user){
        for (Wallets wallet : Wallets.values()) {
            if (wallet.APIVerification(user[5], user[3])){
                if (wallet.withdraw(user[3], amount)) {
                    return true;
                }
            }else{System.out.println("Your wallet is not valid");
            return false;}
        }return false;
    }
}
