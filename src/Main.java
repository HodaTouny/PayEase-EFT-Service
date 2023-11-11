import database.FileDatabase;
import database.IDatabase;
import user.BankUser;
import user.User;
import user.WalletUser;

public class Main {
    public static void main(String[] args) {
        IDatabase db = new FileDatabase();
        User bankUser = new BankUser("hoda", "password123", 1000.0, "123456789", "bank","1234-5678-9012-3456");
        User walletUser = new WalletUser("shahd", "password123", 1000.0, "123456789", "wallet","shahd Wallet");
        //db.saveData(bankUser);
        User user = db.loadData("hoda");
        if (user instanceof BankUser) {
            BankUser bankUser1 = (BankUser) user;
            System.out.println(bankUser1.getCardNumber());
        } else if (user instanceof WalletUser) {
            WalletUser walletUser1 = (WalletUser) user;
            System.out.println(walletUser1.getWalletName());
        }
    }

}