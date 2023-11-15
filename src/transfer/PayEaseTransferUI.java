package transfer;

import java.util.Scanner;
public class PayEaseTransferUI extends TransferUI{
    TransferManager transferManager = new TransferManager();
    @Override
    public String[] getRestData() {
        System.out.println("Enter username you want to transfer to: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        return new String[]{username};
    }

    @Override
    public boolean transfer(double amount, String[] restData, String[] user) {
        return transferManager.PayEaseTransfer(amount,restData,user);


    }

}
