package UI;

import API.Banks;
import API.Wallets;
import bills.billPrinter;
import user.User;

import java.util.Objects;
import java.util.Scanner;

public abstract class BillPaymentUI {
    Scanner scanner = new Scanner(System.in);

    public void BillTemplate(String[] user,BillPaymentUI bill) {
        System.out.println("Enter CRN (Customer Reference Number):");
        String crn = scanner.nextLine();

        String billDetails = bill.specificMenu(crn);

        if(billDetails != null) {
            String[] billArr = billDetails.split(",");
            billPrinter print = new billPrinter();
            print.printBill(billArr);
            System.out.print("Do You Want to Bill The bill? enter (yes) or (No): ");
            String payOrNot = scanner.nextLine();
            if(payOrNot.equalsIgnoreCase("yes")) {
                if ("wallet".equals(user[4])) {
                    for (Wallets wallet : Wallets.values()) {
                        if (wallet.withdraw(user[3], Double.parseDouble(billArr[2]))) {
                            System.out.println("Bill Paid Successfully");
                        }
                    }
                } else if ("bank".equals(user[4])) {
                    for (Banks bank : Banks.values()) {
                        if (bank.withdraw(user[5], Double.parseDouble(billArr[3]))) {
                            System.out.println("Bill Paid Successfully");
                        }
                    }
                }
            }
        }else{
            System.out.println("No Bill To Pay");
        }
    }
    public abstract String specificMenu(String crn);

}