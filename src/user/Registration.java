package user;
import database.FileDatabase;
import database.IDatabase;
import fakeAPI.OTP;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public abstract class Registration {
    IDatabase database = new FileDatabase();

    public boolean OTPVerification(String OTP,OTP otp) {
        return otp.verifyOTP(OTP);

    }

    public boolean verifyUsername(String useName) {
        User user = database.loadData(useName);
        return user == null;
    }

    public  boolean verifyPass(String password) {
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%&*]).{10,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(password);
        return match.matches();
    }

    public abstract boolean APIVerification(String creditCardNumber,String phoneNum);
    public void saveUsers(User user) {
        database.saveData(user);
    }
    public abstract void register();

}
