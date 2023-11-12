package user;

import database.FileDatabase;
import database.IDatabase;
import fakeAPI.OTP;

import java.util.Optional;
import java.util.Scanner;
import java.util.Vector;

public abstract class RegistrationUI {
    Registration registration;

public void registrationTemplate() {
    IDatabase database = new FileDatabase();
    Scanner scanner = new Scanner(System.in);
    System.out.println("1. Wallet Registration");
    System.out.println("2. Bank Registration");
    System.out.print("Choose registration type (1 or 2): ");
    int choice = scanner.nextInt();
    scanner.nextLine();

    RegisterFactory factory = new RegisterFactoryConcrete();
    Registration register = factory.createRegistration(choice);

    UserFactory factoryUser = new UserFactoryConcrete();
    User newUser = factoryUser.createUser(choice);
    ;
//    UserData[4] = newUser.getUserType();

    System.out.println("Enter your phone number: ");
    String phoneNumber = scanner.nextLine();
    String Value =enterData(phoneNumber, register);
    if (Value != null) {
        OTP otp = new OTP();
        String realOtp = otp.getOtp();
        System.out.println(realOtp);
        System.out.println("Enter OTP: ");
        String otpInput = scanner.nextLine();
        boolean otpVerify = register.OTPVerification(otpInput,otp);

        if (otpVerify) {
            String username;
            while (true) {
                System.out.println("please enter unique username");
                username = scanner.nextLine();
                if (register.verifyUsername(username)) {
                    break;
                }
            }

            String password;
            while (true) {
                System.out.println("please enter complex password");
                password = scanner.nextLine();
                if (register.verifyPass(password)) {
                    break;
                }
            }

            newUser.setUser(new String[]{username, password,"0.0",phoneNumber,newUser.getUserType(),"Bank1"});
            database.saveData(newUser);
        }
        else{
            System.out.println("wrong otp!!!");
        }
    }else{
        System.err.println("InValid Informations");
    }
}
    public abstract String enterData(String phoneNum,Registration regist);

}
