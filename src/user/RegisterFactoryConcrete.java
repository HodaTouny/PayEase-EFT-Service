package user;

public class RegisterFactoryConcrete implements RegisterFactory{
    public Registration createRegistration(int num) {
        if (num == 1) {
            return new WalletUserRegistration();
        } else if (num == 2) {
            return new BankUserRegistration();
        } else {
            throw new IllegalArgumentException("Invalid registration type. Supported values are 1 for WalletUserRegistration and 2 for BankUserRegistration.");
        }
    }
}
