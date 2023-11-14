package transfer;
import user.*;

import java.util.Scanner;

public abstract class TransferUI {
    TransferFacade transferFacade = new TransferFacade();
    public void transferUITemplate(User user){
        Scanner scanner = new Scanner(System.in);
        String[] restData = getRestData();
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();
        if(transfer(amount,restData,user)){
            System.out.println("Transfer done successfully");
        }else {
            System.out.println("Transfer failed");
        }
    }
    public abstract String[]  getRestData();
    public abstract boolean transfer(double amount, String[] restData, User user);
}
