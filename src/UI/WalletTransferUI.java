package UI;

import java.util.Scanner;
public class WalletTransferUI  extends TransferUI {

    @Override
    public String getRestData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phone number you want to transfer to: ");
        String phoneNum = scanner.nextLine();
        return phoneNum;
    }

    @Override
    public boolean transfer(double amount, String restData, String[] user) {
        return transferManager.WalletTransfer(amount,restData,user);
    }
}
