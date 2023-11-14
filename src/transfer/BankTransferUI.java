package transfer;
import user.User;

import java.util.Scanner;

public class BankTransferUI extends TransferUI{
    @Override
    public String[] getRestData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter bank name you want to transfer to: ");
        String bankname = scanner.nextLine();
        System.out.println("Enter credit number you want to transfer to: ");
        String creditnumber = scanner.nextLine();
        String[] restData = {bankname,creditnumber};
        return restData;

    }

    @Override
    public boolean transfer(double amount, String[] restData, User user) {
        return transferFacade.BankTransfer(amount,restData,user);
    }


}
