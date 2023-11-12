package user;
import java.util.Scanner;
public abstract class LoginUI {
    public boolean loginMenu(){
        System.out.println("Welcome,again dear customer");
        System.out.println("username:");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("password:");
        String password = scanner.nextLine();
        User user = checkAccount(username,password);
        return user != null;
    }
    public abstract User checkAccount(String userName,String password);
}
