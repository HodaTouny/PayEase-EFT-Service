package user;


import API.Wallets;

import java.util.Scanner;

public class WalletUserRegistration extends Registration{
        public boolean APIVerification(String walletName, String phoneNumber) {
            for (Wallets wallet : Wallets.values()) {
                if (wallet.num.equals(walletName)) {
                    return wallet.APIVerification(walletName,phoneNumber);
                }
            }
            return false;
        }

    @Override
    public void register() {
        System.out.print("Enter your wallet name:");
        Scanner scanner = null;
        String walletName = scanner.nextLine();

    }
}



