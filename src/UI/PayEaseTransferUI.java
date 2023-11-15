package UI;

import UI.TransferUI;
import transfer.BankTransfer;
import transfer.PayEaseTransfer;
import transfer.TransferManager;

import java.util.Scanner;
public class PayEaseTransferUI extends TransferUI {
    PayEaseTransferUI(TransferManager transferManager){
        super(transferManager);
        transferManager.setTransfer(new PayEaseTransfer());
    }

    @Override
    public String getRestData() {
        System.out.println("Enter username you want to transfer to: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        return  username;
    }

    @Override
    public boolean transfer(double amount, String restData, String[] user) {
        return transferManager.TransferMoney(amount,restData,user);


    }

}
