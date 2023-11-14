package user;

import UI.LoginUI;

public interface LoginFactory {
    public Login createLogin(int choice);
}
