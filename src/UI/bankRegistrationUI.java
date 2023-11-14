package UI;
import user.Registration;
import java.util.Scanner;

public class bankRegistrationUI extends RegistrationUI {
    @Override
    public String enterData(String phoneNum, Registration regist) {
        System.out.println("Enter your credit number: ");
        Scanner scanner = new Scanner(System.in);
        String creditnumber = scanner.nextLine();
        if(regist.APIVerification(creditnumber,phoneNum)){
            return creditnumber;
        }
        System.out.println("The bank Refuse your Data,Please check it and try again Later");
       return null;

    }

}
