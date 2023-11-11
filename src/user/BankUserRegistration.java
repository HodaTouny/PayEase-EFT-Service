package user;

public class BankUserRegistration extends Registration{
    public boolean APIVerification() {
        return true;
    }

    public void saveUsers(User user) {
        System.out.println("User saved: " + user.getUserName());
    }
}
