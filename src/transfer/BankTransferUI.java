package transfer;

import java.util.Scanner;

public class BankTransferUI extends TransferUI{
    @Override
    public String[] getRestData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter bank name you want to transfer to: ");
        String bankName = scanner.nextLine();
        System.out.println("Enter credit number you want to transfer to: ");
        String creditNumber = scanner.nextLine();
        return new String[]{bankName,creditNumber};

    }

    @Override
    public boolean transfer(double amount, String[] restData, String[] user) {
        return transferManager.BankTransfer(amount,restData,user);
    }


}
