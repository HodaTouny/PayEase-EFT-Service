package transfer;

public class TransferManager {
    WalletTransfer walletTransfer= new WalletTransfer();
    BankTransfer bankTransfer = new BankTransfer();
    PayEaseTransfer payEaseTransfer = new PayEaseTransfer();
    public boolean WalletTransfer(double amount, String restData, String[] user){
        return walletTransfer.transfer(amount, restData, user);
    }
    public boolean BankTransfer(double amount, String restData, String[] user){
       return bankTransfer.transfer(amount, restData, user);
    }
    public boolean PayEaseTransfer(double amount, String restData, String[] user){
        return payEaseTransfer.transfer(amount, restData, user);
    }
}
