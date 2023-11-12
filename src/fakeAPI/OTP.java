package fakeAPI;

import java.util.Random;

public class OTP {
    private String otp;

    public OTP() {
        otp =generateOTP();
    }

    public String getOtp() {
        return otp;
    }

    public String generateOTP() {
        String numbers = "0123456789";
        StringBuilder otpBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            otpBuilder.append(numbers.charAt(random.nextInt(numbers.length())));
        }
        return otpBuilder.toString();
    }

    public boolean verifyOTP(String userInput) {
        System.out.println(otp);
        return userInput.equals(otp);
    }

}