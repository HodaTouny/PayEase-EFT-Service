package user;

public class BankUser extends User{
    private String creditCard ;
    public BankUser() {
        super("", "", 0.0, "", "");
        this.creditCard = "";
    }

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

    @Override
    public String getData() {
        return getUserName() + "," +
                getPassword() + "," +
                getPayEase() + "," +
                getPhone() + "," +
                getUserType() + "," +
                creditCard;

    }

    @Override
    public void setUser(String[] Data) {
        if (Data.length == 6) {
            setUserName(Data[0]);
            setPassword(Data[1]);
            setPayEase(Double.parseDouble(Data[2]));
            setPhone(Data[3]);
            setUserType(Data[4]);
            setCardNumber(Data[5]);
        }
    }


}
