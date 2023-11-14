package transfer;
import user.User;

import java.util.Scanner;
public class PayEaseTransferUI extends TransferUI{
    TransferFacade transferFacade = new TransferFacade();
    @Override
    public String[] getRestData() {
        System.out.println("Enter username you want to transfer to: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String[] restData = {username};
        return restData;
    }

    @Override
    public boolean transfer(double amount, String[] restData, User user) {
        return transferFacade.PayEaseTransfer(amount,restData,user);


    }

}
