package user;

import database.IDatabase;

public class UsernameLogin extends Login{
    public User checkAccount(String userName, String password, IDatabase database) {
        User user = database.loadData(userName);
        if(user != null && userName.equals(user.getUserName()) && password.equals(user.getPassword())){
            return user;
        }
        return null;
    }
}
