package database;

import user.User;

import java.util.List;

public interface IDatabase {
    public boolean saveData(User user);
    public User loadData(String userName) ;
    public Boolean deposit(String userName, double amount);

}
