package transfer;
import user.*;
import database.*;
import java.util.*;


public class PayEaseTransfer extends Transfer {
    IDatabase database = new Database();

    @Override
    public boolean transfer(double amount, String[] restData, User user) {
            if (database.loadData(restData[0])!= null && (user.getUserName() != restData[0])) {
                if (user.getUserType()== "wallet"){
                    if (walletWithdraw(amount, user)){
                        database.deposit(restData[0], amount);
                        return true;
                    }
                }else if (user.getUserType()== "bank"){
                    if (bankWithdraw(amount, user)){
                        database.deposit(restData[0], amount);
                        return true;
                    }

                }
            }
            else {System.out.println("Receiver's username is not valid");
            return false;}
        return false;
    }
}