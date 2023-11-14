package fakeAPI;

public interface WalletAPI {
    public boolean verifyUser(String walletName,String phone);
    public boolean withdraw(String phone, double amount);
    public boolean deposit(String phone, double amount);
}
