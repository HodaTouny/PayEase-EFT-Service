package fakeAPI;

public class Wallet1 implements WalletAPI{
    public boolean verifyUser(String walletName, String phone){
        return true;
    }
    public boolean withdraw(String phone, double amount){
        return true;
    }
}
