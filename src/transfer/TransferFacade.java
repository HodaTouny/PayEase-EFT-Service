package transfer;

import user.User;

public class TransferFacade {
    WalletTransfer walletTransfer= new WalletTransfer();
    BankTransfer bankTransfer = new BankTransfer();
    PayEaseTransfer payEaseTransfer = new PayEaseTransfer();
    public boolean WalletTransfer(double amount, String[] restData, User user){
        return walletTransfer.transfer(amount, restData, user);
    }
    public boolean BankTransfer(double amount, String[] restData, User user){
       return bankTransfer.transfer(amount, restData, user);
    }
    public boolean PayEaseTransfer(double amount, String[] restData, User user){
        return payEaseTransfer.transfer(amount, restData, user);
    }
}
