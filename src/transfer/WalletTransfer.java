package transfer;
import API.*;

public class WalletTransfer extends Transfer {

    @Override
    public boolean transfer(double amount, String restData, String[] user) {
        for (Wallets wallet : Wallets.values()) {
            if (wallet.APIVerification(restData) && (!user[3].equals(restData))) {
                if (user[4].equals("wallet")){
                    if (walletWithdraw(amount, user)){
                        wallet.deposit(restData, amount);
                        return true;
                    }
                }else if (user[4].equals("bank")){
                    if (bankWithdraw(amount, user)){
                        wallet.deposit(restData, amount);
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
