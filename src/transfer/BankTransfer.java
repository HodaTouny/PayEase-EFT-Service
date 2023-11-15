package transfer;

import API.*;

public class BankTransfer extends Transfer {

    @Override
    public boolean transfer(double amount, String restData, String[] user) {
        if (user[4].equals("bank")){
            for (Banks bank : Banks.values()) {
                if (bank.APIVerification(restData) && (!user[5].equals(restData))) {
                    if (bankWithdraw(amount, user)) {
                        bank.deposit(restData, amount);
                        return true;
                    }
                }else{System.out.println("Receiver's bank account is not valid");
                    return false;}
            }
        }else {System.out.println("You can't transfer money from wallet to bank account");
        }
        return false;
    }
    }
