package user;

import fakeAPI.OTP;

import java.util.Scanner;

public abstract class RegistrationUI {
    Registration registration;
   // String phoneNum;
public void registrationTemplate() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("1. Wallet Registration");
    System.out.println("2. Bank Registration");
    System.out.print("Choose registration type (1 or 2): ");
    int choice = scanner.nextInt();
    RegisterFactory factory = new RegisterFactoryConcrete();
    Registration register = factory.createRegistration(choice);
    System.out.println("Enter your phone number: ");
    String phoneNumber = scanner.nextLine();
    boolean verify = enterData(phoneNumber, register);
    if (verify) {
        OTP otp = new OTP();
        System.out.println(otp.generateOTP());
        System.out.println("Enter otp: ");
        String otpInput = scanner.nextLine();
        boolean otpVerify = register.OTPVerification(otpInput);
        if (otpVerify) {
            while (true) {
                System.out.println("please enter unique username");
                String username = scanner.nextLine();
                if (register.verifyUsername(username)) {
                    break;
                }
            }
            while (true) {
                System.out.println("please enter complex password");
                String password = scanner.nextLine();
                if (register.verifyPass(password)) {
                    break;
                }
            }

        }
        else{
            System.out.println("wrong otp!!!");
        }
    }
}
    public abstract boolean enterData(String phoneNum,Registration regist);

}
