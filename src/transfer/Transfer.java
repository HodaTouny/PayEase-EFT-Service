package transfer;
import API.*;
import user.*;

public abstract class Transfer {
    public  abstract boolean transfer(double amount,String[] restData, User user);
    public boolean bankWithdraw(double amount, User user){
        for (Banks bank : Banks.values()) {
            if (bank.APIVerification(((BankUser) user).getCardNumber())) {
                if (bank.withdraw(((BankUser) user).getCardNumber(), amount)) {
                    return true;
                }
            }else {System.out.println("Your bank account is not valid");
            return false;}
        }return false;
    }
    public boolean walletWithdraw(double amount, User user){
        for (Wallets wallet : Wallets.values()) {
            if (wallet.APIVerification(((WalletUser) user).getWalletName(),  user.getPhone())){
                if (wallet.withdraw(user.getPhone(), amount)) {
                    return true;
                }
            }else{System.out.println("Your wallet is not valid");
            return false;}
        }return false;
    }
}
