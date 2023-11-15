package inquery;

import APICallers.Wallets;

public class WalletInquireConcrete implements BalanceInquire {
    @Override
    public double getBalance(String id) {
        for (Wallets wallet : Wallets.values()) {
            return wallet.getBalance(id);
        }
        return 0.0;

    }
}
