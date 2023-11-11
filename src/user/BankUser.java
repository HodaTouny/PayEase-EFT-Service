package user;

public class BankUser extends User{
    private String creditCard = null;
    public String getCreditCard() {
        return creditCard;
    }
    public void setCreditCard(String creditCardnum) {
        creditCard = creditCardnum;
    }

}
