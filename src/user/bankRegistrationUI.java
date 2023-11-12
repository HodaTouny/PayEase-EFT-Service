package user;
import java.util.Scanner;

public class bankRegistrationUI extends RegistrationUI{
    @Override
    public boolean enterData(String phoneNum,Registration regist) {
        System.out.println("Enter your credit number: ");
//        Scanner scanner = null;
//        String creditnumber = scanner.nextLine();
        Scanner scanner = new Scanner(System.in);
        String creditnumber = scanner.nextLine();
       return regist.APIVerification(creditnumber,phoneNum);



    }
}
