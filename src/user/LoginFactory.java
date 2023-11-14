package user;

import UI.LoginUI;

public interface LoginFactory {
    public LoginUI createLogin(int choice);
}
