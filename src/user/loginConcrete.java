package user;

import UI.LoginUI;
import database.Database;
import database.IDatabase;

import java.util.Objects;

public class loginConcrete extends LoginUI {
    IDatabase databse = new Database();
    @Override
    public User checkAccount(String userName, String password) {
        User user = databse.loadData(userName);
        if(user != null && Objects.equals(user.password, password)){
            return user;
        }
        return null;
    }
}
