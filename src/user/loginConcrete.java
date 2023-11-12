package user;

import database.FileDatabase;
import database.IDatabase;

import java.util.Objects;

public class loginConcrete extends LoginUI{
    IDatabase databse = new FileDatabase();
    @Override
    public User checkAccount(String userName, String password) {
        User user = databse.loadData(userName);
        if(user != null && Objects.equals(user.password, password)){
            return user;
        }
        return null;
    }
}
