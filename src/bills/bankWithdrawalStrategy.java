package bills;

import fakeAPI.BankAPI;

public class bankWithdrawalStrategy implements WithdrawalStrategy{
    private BankAPI bankAPI;
    public bankWithdrawalStrategy(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }
    @Override
    public boolean withdraw(String identifier, double amount) {
        return bankAPI.withdraw(identifier, amount);
    }
}
