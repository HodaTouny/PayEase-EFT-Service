package transfer;
import user.BankUser;
import user.*;
import fakeAPI.*;
import database.*;
import java.util.*;


public class PayEaseTransfer implements Transfer {

    @Override
    public boolean transfer(double amount, String[] restData, User user) {
        IDatabase database = new Database();
        BankAPI bankAPI = new Bank1();
        WalletAPI walletAPI = new Wallet1();
        if (checkAccount(restData, user)) {
            if(user instanceof BankUser){
                BankUser bankUser = (BankUser) user;
                if (bankAPI.withdraw(bankUser.getCardNumber(), amount) && database.deposit(restData[0], amount)) {
                    System.out.println("Transfer done successfully");
                    return true;
                }
        }else if(user instanceof WalletUser){
                if (walletAPI.withdraw(user.getPhone(), amount) && database.deposit(restData[0], amount)) {
                    System.out.println("Transfer done successfully");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean checkAccount(String[] restData, User user) {
        IDatabase database = new Database();
        if(database.loadData(restData[0]) != null && restData[0]!=user.getUserName()){
            return true;
        }System.out.println("Invalid account");
        return false;
    }


}
