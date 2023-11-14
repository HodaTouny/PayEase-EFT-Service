package UI;
import database.IDatabase;
import user.ConcreteLoginFactory;
import user.Login;
import user.LoginFactory;
import user.User;

import java.util.Scanner;
public abstract class LoginUI {
    public User loginMenu(IDatabase database){
        LoginFactory loginFactory = new ConcreteLoginFactory();
        Login loginN = loginFactory.createLogin(1);
        System.out.println("Welcome,again dear customer");
        LoginUIFactory factory = new LoginUIFactoryConcrete();
        LoginUI login = factory.createLoginUI(1);
        return login.LoginLogic(database,loginN);
    }

    public abstract User LoginLogic(IDatabase database,Login login);

}
