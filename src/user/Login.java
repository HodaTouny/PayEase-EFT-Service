package user;

import database.FileDatabase;
import database.IDatabase;

public abstract class Login {
    IDatabase fileDatabase = new FileDatabase();
    private User user;

    public boolean verifyCredentials(String userName,String password){
        user = fileDatabase.loadData(userName);
        if(user != null && user.getPassword().equals(password)){
            return true;
        }
        return false;
    }
    public void loadUserProfile(){
        System.out.println("User Name: " + user.getUserName());
        System.out.println("User Type: " + user.getUserType());
    }
}
