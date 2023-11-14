package database;
import user.User;

public interface IDatabase {
    public boolean saveData(User user);
    public User loadData(String userName) ;
    public Boolean deposit(String userName, double amount);

}
