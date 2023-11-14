package transfer;
import user.User;

import java.util.Scanner;
public class WalletTransferUI  extends TransferUI{

    @Override
    public String[] getRestData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter wallet name you want to transfer to: ");
        String walletName = scanner.nextLine();
        System.out.println("Enter phone number you want to transfer to: ");
        String phoneNum = scanner.nextLine();
        String[] restData = {walletName,phoneNum};
        return restData;
    }

    @Override
    public boolean transfer(double amount, String[] restData, User user) {
        return transferFacade.WalletTransfer(amount,restData,user);
    }
}
