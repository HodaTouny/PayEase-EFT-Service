package UI;
import user.Registration;

import java.util.Scanner;

public class walletRegitstrationUI  extends RegistrationUI {
    @Override
    public String enterData(String phoneNum, Registration regist) {
        System.out.println("Enter your wallet name: ");
        Scanner scanner = new Scanner(System.in);
        String walletName = scanner.nextLine();
        if(regist.APIVerification(walletName, phoneNum)){
            return walletName;
        }
        System.out.println("The Wallet Refuse your Data,Please check it and try again Later");
        return null;
    }
}