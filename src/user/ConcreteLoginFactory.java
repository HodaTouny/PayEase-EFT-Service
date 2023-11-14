package user;

import UI.LoginUI;
import UI.loginConcrete;

public class ConcreteLoginFactory implements LoginFactory {
    @Override
    public Login createLogin(int choice) {
        if(choice == 1){
            return new UsernameLogin();
        }else{
            throw new IllegalArgumentException("Invalid Login Option.");
        }
    }
}
