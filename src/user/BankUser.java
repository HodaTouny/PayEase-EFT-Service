package user;

public class BankUser extends User{
    private String creditCard ;

    public BankUser(String userName, String password, double payEase, String phone, String userType, String creditCard) {
        super(userName, password, payEase, phone, userType);
        this.creditCard = creditCard ;
    }
    public String getCreditCard() {
        return creditCard;
    }
    public void setCreditCard(String creditCardnum) {
        creditCard = creditCardnum;
    }

    public String getCardNumber() {
        return creditCard;
    }
    public void setCardNumber(String creditCardnum) {
        creditCard = creditCardnum;
    }

}
