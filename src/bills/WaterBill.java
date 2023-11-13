package bills;

import API.waterCompanies;
import fakeAPI.CompanyAPI;
import fakeAPI.WalletAPI;
import user.User;

import java.util.HashMap;
import java.util.Map;

public class WaterBill implements IBill {
    private String usageAmount;
    private final String crn;
    private final Map<String, PaymentProcessor> paymentProcessors;

    public WaterBill(String crn, Map<String, PaymentProcessor> paymentProcessors) {
        this.crn = crn;
        this.paymentProcessors = paymentProcessors;
    }

    @Override
    public void createBill() {
        CompanyAPI waterCompany = waterCompanies.WATER1.createWaterCompany();
        String bill = waterCompany.CreateBilll(crn);
        String[] parts = bill.split(",");
        usageAmount = parts[2].trim();
    }

    @Override
    public void performPayment(User user) {
        PaymentProcessor paymentProcessor = paymentProcessors.get(user.getUserType());
        if (paymentProcessor != null) {
            double amount = Double.parseDouble(usageAmount);
            boolean paymentResult = paymentProcessor.withdraw(user.getPhone(), amount);
            if (paymentResult) {
                System.out.println(user.getUserType() + " payment successful");
            } else {
                System.out.println(user.getUserType() + " payment failed");
            }
        } else {
            System.out.println("Invalid user type");
        }
    }
}



