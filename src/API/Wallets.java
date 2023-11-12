package API;

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

    Wallets(String walletName) {
        this.walletName = walletName;
    }

    public String getWalletName() {
        return walletName;
    }

    public abstract WalletAPI createWallet();

    public boolean APIVerification(String walletName, String phoneNumber) {
        WalletAPI walletAPI = createWallet();
        return walletAPI.verifyUser(walletName, phoneNumber);
    }
}
