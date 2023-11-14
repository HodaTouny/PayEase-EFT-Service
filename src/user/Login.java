package user;

import database.IDatabase;

public abstract class Login {
    public abstract User checkAccount(String userName, String password, IDatabase database);
}
