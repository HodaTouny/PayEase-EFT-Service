package user;

public interface UserFactory {
    public User createUser(int Choice);
    public User createUser(String UserType);
}
