package user;

import API.Wallets;

public class WalletUserRegistration extends Registration{
        public boolean APIVerification(String walletName, String phoneNumber) {
            for (Wallets wallet : Wallets.values()) {
                    if (wallet.APIVerification(walletName, phoneNumber)) {
                        return true;
                    }
            }
            return false;
        }

}



