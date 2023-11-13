//package bills;
//
//import user.User;
//
//public class BillPaymentManager {
//    private final WithdrawalStrategy withdrawalStrategy;
//    private IBillFactory billFactory;
//    double billAmount;
//
//    public BillPaymentManager(WithdrawalStrategy withdrawalStrategy, IBillFactory billFactory) {
//        this.withdrawalStrategy = withdrawalStrategy;
//        this.billFactory = billFactory;
//    }
//
//    //    public void generateBill(String crn) {
////        String billDetails = billFactory.getBillDetails(crn);
////        System.out.println(billDetails);
////    }
//    public boolean performPayment(String[] data, double amount) {
//        return withdrawalStrategy.withdraw(data[5], amount);
//    }
//
//    public void generateBill(String crn, int choice) {
//        String billDetails = billFactory.getBillDetails(crn);
//        System.out.println(billDetails);
//        switch (choice) {
//            case 1:
//                billAmount = extractAmountFromBillDetails(billDetails, "Water");
//                break;
//            case 2:
//                billAmount = extractAmountFromBillDetails(billDetails, "Electricity");
//                break;
//            case 3:
//                billAmount = extractAmountFromBillDetails(billDetails, "Gas");
//                break;
//            default:
//                break;
//        }
//    }
//
//    private double extractAmountFromBillDetails(String billDetails, String billType) {
//        String[] fields = billDetails.split(",");
//        return Double.parseDouble(fields[2]);
//
//    }
//}

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

    public double generateBill(String crn, int choice,String choice2) {
        String billDetails = billFactory.getBillDetails(choice2,crn);
        System.out.println(billDetails);
        switch (choice) {
            case 1:
                billAmount = extractAmount(billDetails, "Water");
                break;
            case 2:
                billAmount = extractAmount(billDetails, "Electricity");
                break;
            case 3:
                billAmount = extractAmount(billDetails, "Gas");
                break;
            default:
                break;
        }
        return billAmount;
    }

    private double extractAmount(String billDetails, String billType) {
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


