package user;

import java.util.Scanner;

public class walletRegitstrationUI  extends RegistrationUI {

    @Override
    public boolean enterData(String phoneNum, Registration regist) {
        System.out.println("Enter your wallet name: ");
        Scanner scanner = new Scanner(System.in);
        String walletName = scanner.nextLine();
        return regist.APIVerification(walletName, phoneNum);

    }
}