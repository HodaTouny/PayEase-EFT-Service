package transfer;
import API.*;

public class WalletTransfer extends Transfer {

    @Override
    public boolean transfer(double amount, String[] restData, String[] user) {
        for (Wallets wallet : Wallets.values()) {
            if (wallet.APIVerification(restData[0], restData[1]) && (!user[3].equals(restData[1]))) {
                if (user[4].equals("wallet")){
                    if (walletWithdraw(amount, user)){
                        wallet.deposit(restData[1], amount);
                        return true;
                    }
                }else if (user[4].equals("bank")){
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
