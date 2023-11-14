package UI;

import database.Database;
import database.IDatabase;
import user.Login;
import user.User;

import java.util.Objects;
import java.util.Scanner;

public class loginConcrete extends LoginUI {

    @Override
    public User LoginLogic(IDatabase database, Login login) {
        System.out.print("username:");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.print("password:");
        String password = scanner.nextLine();
        return login.checkAccount(username,password,database);
    }
}
