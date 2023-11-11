package user;

public class WalletUser extends User{
    private String walletName = null;
    public String getCreditCard() {
        return walletName;
    }
    public void setCreditCard(String wallet) {
      walletName = wallet;
    }
}
