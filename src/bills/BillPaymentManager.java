package bills;

import user.User;

public class BillPaymentManager {

    private final WithdrawalStrategy withdrawalStrategy;
    private  IBillFactory billFactory;
    public BillPaymentManager(WithdrawalStrategy withdrawalStrategy, IBillFactory billFactory) {
        this.withdrawalStrategy = withdrawalStrategy;
        this.billFactory = billFactory;
    }
    public void generateBill() {
       // billFactory.getBill();
    }
    public boolean performPayment(String[] data, double amount) {
        return withdrawalStrategy.withdraw(data[5], amount);
    }
}
