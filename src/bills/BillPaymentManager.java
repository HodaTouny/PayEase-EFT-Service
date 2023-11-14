package bills;
import user.User;
public class BillPaymentManager {
    private final WithdrawalStrategy withdrawalStrategy;
    private IBillFactory billFactory;
    private double billAmount;

    public BillPaymentManager(WithdrawalStrategy withdrawalStrategy, IBillFactory billFactory) {
        this.withdrawalStrategy = withdrawalStrategy;
        this.billFactory = billFactory;
    }

    public double generateBill(String crn,String choice2) {
        String billDetails = billFactory.getBillDetails(choice2,crn);
        System.out.println(billDetails);
        billAmount = extractAmount(billDetails);
        return billAmount;
    }

    private double extractAmount(String billDetails) {
        String[] fields = billDetails.split(",");
        if (fields.length >= 3) {
            return Double.parseDouble(fields[2]);
        } else {
            System.err.println("Error");
            return 0.0;
        }
    }

    public double getBillAmount() {
        return billAmount;
    }

    public boolean performPayment(User user,  double amount) {
        String[] userData = user.getData().split(",");
        if (userData.length >= 6) {
            return withdrawalStrategy.withdraw(userData[5], amount);
        } else {
            System.err.println("Insufficient user data for withdrawal.");
            return false;
        }
    }

}


