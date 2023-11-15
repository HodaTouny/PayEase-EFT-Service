package user;

import APICallers.Wallets;

public class WalletUserRegistration extends Registration{
        public boolean APIVerification(String walletName, String phoneNumber) {
            for (Wallets wallet : Wallets.values()) {
                    if (wallet.APIVerification(phoneNumber)) {
                        return true;
                    }
            }
            return false;
        }

}



