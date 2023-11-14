package UI;

public class LoginUIFactoryConcrete implements LoginUIFactory {
    public LoginUI createLoginUI(int choice){
        if(choice == 1){
            return new loginConcrete();
        }
        return null;
    }
}
