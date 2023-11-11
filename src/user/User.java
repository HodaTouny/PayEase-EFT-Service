package user;

public abstract class User {
    protected String userName = null;
    protected String password = null;
    protected double payEase = 0;
    protected String phone = null;
    protected String userType = null;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String user) {
        userName = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getPayEase() {
        return payEase;
    }

    public void setPayEase(double payEase) {
        this.payEase = payEase;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
