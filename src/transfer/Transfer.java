package transfer;
import user.User;

public interface Transfer {
    public User user = null;
    public void transfer(double amount);
}
