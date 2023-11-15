package transfer;
import java.util.Scanner;
public class WalletTransferUI  extends TransferUI{

    @Override
    public String[] getRestData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter wallet name you want to transfer to: ");
        String walletName = scanner.nextLine();
        System.out.println("Enter phone number you want to transfer to: ");
        String phoneNum = scanner.nextLine();
        return new String[]{walletName,phoneNum};
    }

    @Override
    public boolean transfer(double amount, String[] restData, String[] user) {
        return transferManager.WalletTransfer(amount,restData,user);
    }
}
