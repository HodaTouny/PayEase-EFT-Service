package user;
import java.util.Scanner;

public class bankRegistrationUI extends RegistrationUI{
    @Override
    public String enterData(String phoneNum,Registration regist) {
        System.out.println("Enter your credit number: ");
        Scanner scanner = new Scanner(System.in);
        String creditnumber = scanner.nextLine();
        if(regist.APIVerification(creditnumber,phoneNum)){
            return creditnumber;
        }
       return null;

    }

}
