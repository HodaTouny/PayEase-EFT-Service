package UI;

import database.Database;
import database.IDatabase;
import fakeAPI.OTP;
import user.*;

import java.util.Optional;
import java.util.Scanner;
import java.util.Vector;

public abstract class RegistrationUI {
    Registration register;
    Scanner scanner = new Scanner(System.in);

public boolean registrationTemplate(int choice,IDatabase database) {
    RegisterFactory factory = new RegisterFactoryConcrete();
    register = factory.createRegistration(choice);
    UserFactory factoryUser = new UserFactoryConcrete();
    User newUser = factoryUser.createUser(choice);

    System.out.print("Please Enter the Phone Number linked to your Account:");
    String phoneNumber = scanner.nextLine();

    String Value =enterData(phoneNumber, register);
    if(Value != null) {
        if (otpVerify()) {
            String[] usernamePassword = EnterLoginData();
            newUser.setUser(new String[]{usernamePassword[0], usernamePassword[1], "0.0", phoneNumber, newUser.getUserType(), Value});
        }
        if (!database.saveData(newUser)) {
            System.err.println("Registration Error: There may be a failure in our database. Please re-register after a few seconds.");
        } else {
            System.out.println("Registration successfully completed. We wish you a positive and seamless experience.");
            return true;
        }

    }
    return false;

}

    public abstract String enterData(String phoneNum,Registration regist);
    private boolean otpVerify() {
        for (int i=0;i<3;i++) {
            OTP otp = new OTP();
            String realOtp = otp.getOtp();
            System.out.println(realOtp);
            System.out.print("Enter OTP: ");
            String otpInput = scanner.nextLine();
            boolean verify = register.OTPVerification(otpInput, otp);
            if (verify) {
                return true;
            }
            System.out.println("Invalid OTP,Please try again.");
        }
        System.out.println("Maximum chances reached,OTP verification failed.");
        return false;
    }

    private String[] EnterLoginData() {
        String username, password;
        do {
            System.out.print("Please enter a unique username:");
            username = scanner.nextLine();
        } while (!register.verifyUsername(username));
        do {
            System.out.print("Please enter a complex password:");
            password = scanner.nextLine();
        } while (!register.verifyPass(password));

        return new String[]{username, password};
    }

}

