package fakeAPI;

public class Bank1 implements BankAPI {
    public boolean verifyUser(String cardNumber, String phone){
        return true;
    }
    public boolean withdraw(String cardNumber, double amount){
        return true;
    }
}
