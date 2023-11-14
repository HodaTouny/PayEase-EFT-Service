package UI;

import API.Banks;
import API.Wallets;
import user.User;

import java.util.Objects;
import java.util.Scanner;

public abstract class BillPaymentUI {
    Scanner scanner = new Scanner(System.in);

    public void BillTemplate(String[] user,BillPaymentUI bill) {

        System.out.println("Enter CRN (Customer Reference Number):");
        String crn = scanner.nextLine();

        String billDetails = bill.specificMenu(crn);

        System.out.println("Bill Details : " + billDetails);

        if(billDetails != null) {
            String[] billArr = billDetails.split(",");
            if ("wallet".equals(user[4])) {
                for (Wallets wallet : Wallets.values()) {
                    if (wallet.withdraw(user[3], Double.parseDouble(billArr[2]))) {
                        System.out.println("Withdrawn Done");
                    }
                }
            } else if ("bank".equals(user[4])) {
                for (Banks bank : Banks.values()) {
                    if (bank.withdraw(user[5], Double.parseDouble(billArr[3]))) {
                        System.out.println("Withdraw DONE");
                    }
                }
            }
        }else{
            System.out.println("No Bill To Pay");
        }
    }
    public abstract String specificMenu(String crn);
}