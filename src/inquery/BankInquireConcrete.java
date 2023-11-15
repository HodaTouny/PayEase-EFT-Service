package inquery;

import APICallers.Banks;

public class BankInquireConcrete implements BalanceInquire {
    @Override
    public double getBalance(String id) {
        for (Banks bank : Banks.values()) {
            return bank.getBalance(id);
        }
        return 0.0;

    }
}
