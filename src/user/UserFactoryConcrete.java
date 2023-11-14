package user;

public class UserFactoryConcrete implements UserFactory{
    @Override
    public User createUser(int choice) {
        if (choice == 1) {
            return new WalletUser();
        } else if (choice == 2) {
            return new BankUser();
        } else {
            throw new IllegalArgumentException("Invalid choice");
        }
    }

    @Override
    public User createUser(String UserType){
        if("wallet".equals(UserType)){
            return new WalletUser();
        }else if("bank".equals(UserType)){
            return new BankUser();
        }else{
            throw new IllegalArgumentException("Invalid User type.");
        }
    }
}
