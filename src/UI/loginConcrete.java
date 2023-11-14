package UI;

import database.Database;
import database.IDatabase;
import user.User;

import java.util.Objects;

public class loginConcrete extends LoginUI {
    @Override
    public User checkAccount(String userName, String password,IDatabase database) {
        User user = database.loadData(userName);
        if(user != null && userName.equals(user.getUserName()) && password.equals(user.getPassword())){
            return user;
        }
        return null;
    }
}
