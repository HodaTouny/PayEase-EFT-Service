package fakeAPI;

public interface BankAPI {
    public boolean verifyUser(String cardNumber, String phone);
    public boolean withdraw(String cardNumber, double amount);

}
