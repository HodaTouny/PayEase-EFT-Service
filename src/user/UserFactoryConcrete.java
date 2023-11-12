package user;

public class UserFactoryConcrete implements UserFactory{
    @Override
    public User createUser(String userType) {
       {
            if ("bank".equals(userType)) {
                return new BankUser();
            } else if ("wallet".equals(userType)) {
                return new WalletUser();
            } else {
                return null;
            }
        }

    }
}
