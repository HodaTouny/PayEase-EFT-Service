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


}
