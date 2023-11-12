import user.RegistrationUI;
import user.bankRegistrationUI;


public class Main {
    public static void main(String[] args) {
//        RegistrationUI walletRegistrationUI = new walletRegitstrationUI();
//        System.out.println("Testing Wallet Registration:");
//        walletRegistrationUI.registrationTemplate();

        RegistrationUI BankRegistrationUI = new bankRegistrationUI();
        System.out.println("Testing Bank Registration:");
        BankRegistrationUI.registrationTemplate();
    }
}



