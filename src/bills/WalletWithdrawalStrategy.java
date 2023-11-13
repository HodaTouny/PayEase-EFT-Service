package bills;

import fakeAPI.WalletAPI;

public class WalletWithdrawalStrategy implements WithdrawalStrategy{

    private WalletAPI walletAPI;

    public void walletPaymentProcessor(WalletAPI walletAPI) {
        this.walletAPI = walletAPI;
    }

    public WalletWithdrawalStrategy(WalletAPI walletAPI) {
        this.walletAPI = walletAPI;
    }

    @Override
    public boolean withdraw(String identifier, double amount) {
        return walletAPI.withdraw(identifier, amount);
    }
}

