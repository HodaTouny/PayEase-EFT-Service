package fakeAPI;

import java.util.Objects;
import java.util.Random;

public class OTP {
    private String otp;
    public OTP(){this.otp=null;}
    public String getOtp(){
        return otp;
    }

    public String generateOTP() {
        Random random = new Random();
        int randomOTP = random.nextInt(10000);
        this.otp = String.format("%04d", randomOTP);
        return this.otp;
    }

    public boolean verifyOTP(String OTP) {
        return Objects.equals(OTP, otp);
    }

}

