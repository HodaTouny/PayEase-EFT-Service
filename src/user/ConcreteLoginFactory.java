package user;

import UI.LoginUI;

public class ConcreteLoginFactory implements LoginFactory{

    @Override
    public LoginUI createLogin(int choice) {
        if(choice == 1){
            return new loginConcrete();
        }else{
            throw new IllegalArgumentException("Invalid Login Option.");
        }
    }
}
