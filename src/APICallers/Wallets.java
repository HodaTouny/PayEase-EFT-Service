package APICallers;

import fakeAPI.Wallet1;
import fakeAPI.WalletAPI;

public enum Wallets {
    WALLET1("Wallet1") {
        @Override
        public WalletAPI createWallet() {
            return new Wallet1();
        }
    };

    private final String walletName;
    public String num;

    Wallets(String walletName) {
        this.walletName = walletName;
    }

    public String getWalletName() {
        return walletName;
    }

    public abstract WalletAPI createWallet();

    public boolean APIVerification(String phoneNumber) {
        WalletAPI walletAPI = createWallet();
        return walletAPI.verifyUser(phoneNumber);
    }

    public boolean withdraw(String phoneNumber, double amount) {
        WalletAPI walletAPI = createWallet();
        return walletAPI.withdraw(phoneNumber, amount);
    }
    public double getBalance(String phonenumber){
        WalletAPI walletAPI= createWallet();
        return  walletAPI.getBalance(phonenumber);
    }
    public boolean deposit(String phoneNumber, double amount) {
        WalletAPI walletAPI = createWallet();
        return walletAPI.deposit(phoneNumber, amount);
    }

}
