package fakeAPI;

public class OTP {
    private String otp;
    public OTP(String otp){
        this.otp = otp;
    }
    public String getOtp(){
        return otp;
    }
    public String generateOTP(){
        return otp;
    };
    public boolean verifyOTP(String otp){return true;};
}
