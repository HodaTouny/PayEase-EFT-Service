package user;

import database.Database;
import database.IDatabase;

public class Login {
    IDatabase fileDatabase = new Database();
    private User user;

    public boolean verifyCredentials(String userName,String password){
        user = fileDatabase.loadData(userName);
        if(user != null && user.getPassword().equals(password)){
            loadUserProfile();
            return true;
        }
        return false;
    }
    public void loadUserProfile(){
        System.out.println("User Name: " + user.getUserName());
        System.out.println("User Type: " + user.getUserType());
    }
}
