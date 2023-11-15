package UI;


import transfer.BankTransfer;
import transfer.PayEaseTransfer;
import transfer.TransferManager;

import java.util.Scanner;

public class BankTransferUI extends TransferUI {
    BankTransferUI(TransferManager transferManager) {
        super(transferManager);
        transferManager.setTransfer(new BankTransfer());
    }
    @Override
    public String getRestData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter credit number you want to transfer to: ");
        String creditNumber = scanner.nextLine();
        return creditNumber;

    }

    @Override
    public boolean transfer(double amount, String restData, String[] user) {
        return transferManager.TransferMoney(amount,restData,user);
    }


}
