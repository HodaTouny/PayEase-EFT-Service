package UI;

import transfer.BankTransfer;
import transfer.PayEaseTransfer;
import transfer.TransferManager;
import transfer.WalletTransfer;

import java.util.Scanner;
public class WalletTransferUI  extends TransferUI {
    WalletTransferUI(TransferManager transferManager){
        super(transferManager);
        transferManager.setTransfer(new WalletTransfer());
    }

    @Override
    public String getRestData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phone number you want to transfer to: ");
        String phoneNum = scanner.nextLine();
        return phoneNum;
    }

    @Override
    public boolean transfer(double amount, String restData, String[] user) {
        return transferManager.TransferMoney(amount,restData,user);
    }
}
