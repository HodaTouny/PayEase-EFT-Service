package user;
import database.IDatabase;

public abstract class Registration {
    IDatabase database = null;

    public boolean OTPVerification() {
        return true;
    }

    public boolean verifyUsername(String useName) {
        return false;
    }

    public boolean verifyPass(String password) {
        return true;
    }

    public abstract boolean APIVerification();
    public abstract void saveUsers(User user);

}
