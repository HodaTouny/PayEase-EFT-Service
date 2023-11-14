package UI;
import user.User;

import java.util.Scanner;
public abstract class LoginUI {
    public User loginMenu(){
        System.out.println("Welcome,again dear customer");
        System.out.print("username:");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.print("password:");
        String password = scanner.nextLine();
        return checkAccount(username,password);
    }
    public abstract User checkAccount(String userName,String password);
}
