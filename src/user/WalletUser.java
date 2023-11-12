package user;

public class WalletUser extends User{
    private String walletName;
    public WalletUser() {
        super("", "", 0.0, "", "");
        this.walletName = "";
    }
    public WalletUser(String userName, String password, double payEase, String phone, String userType, String walletName) {
        super(userName, password, payEase, phone, userType);
        this.walletName = walletName;
    }
    public String getWalletName() {
        return walletName;
    }
    public void setWalletName(String wallet) {
      walletName = wallet;
    }
    public String getData() {
        return getUserName() + "," +
                getPassword() + "," +
                getPayEase() + "," +
                getPhone() + "," +
                getUserType() + "," +
                walletName;

    }

    @Override
    public void setUser(String[] Data) {
        if (Data.length == 6) {
            setUserName(Data[0]);
            setPassword(Data[1]);
            setPayEase(Double.parseDouble(Data[2]));
            setPhone(Data[3]);
            setUserType(Data[4]);
            setWalletName(Data[5]);
        }
    }


}
