package user;

public class RegisterFactoryConcrete implements RegisterFactory{
    public Registration createRegistration(int num) {
        if (num == 1) {
            return new BankUserRegistration();
        } else if (num == 2) {
            return new WalletUserRegistration();
        } else {
            return null;
        }
    }
}
