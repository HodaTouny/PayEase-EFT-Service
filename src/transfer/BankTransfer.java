package transfer;

import user.*;
import API.*;

public class BankTransfer extends Transfer {

    @Override
    public boolean transfer(double amount, String[] restData, String[] user) {
        if (user[4].equals("bank")){
            for (Banks bank : Banks.values()) {
                if (bank.APIVerification(restData[1]) && (!user[5].equals(restData[1]))) {
                    if (bankWithdraw(amount, user)) {
                        bank.deposit(restData[1], amount);
                        return true;
                    }
                }else{System.out.println("Receiver's bank account is not valid");
                    return false;}
            }return false;
        }else {System.out.println("You can't transfer money from wallet to bank account");
            return false;}
        }
    }
