package transfer;
import database.*;


public class PayEaseTransfer extends Transfer {
    IDatabase database = new Database();

    @Override
    public boolean transfer(double amount, String[] restData, String[] user) {
            if (database.loadData(restData[0])!= null && (!user[0].equals(restData[0]))) {
                if (user[4].equals("wallet")){
                    if (walletWithdraw(amount, user)){
                        database.deposit(restData[0], amount);
                        return true;
                    }
                }else if (user[4].equals("bank")){
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