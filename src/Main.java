import fakeAPI.CompanyAPI;
import fakeAPI.Electricity1;

public class Main {
    public static void main(String[] args) {
        CompanyAPI x = new Electricity1();
        String userId = "101";
        String userBill = x.CreateBilll(userId);
        System.out.println("Bill for User ID " + userId + ":\n" + userBill);
    }

}