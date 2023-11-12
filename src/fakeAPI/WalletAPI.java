package fakeAPI;

public interface WalletAPI {
    public boolean verifyUser(String phone);
    public boolean withdraw(String phone, double amount);
}
