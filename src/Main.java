import fakeAPI.Bank1;
import fakeAPI.BankAPI;
import fakeAPI.Wallet1;
import fakeAPI.WalletAPI;
import user.RegistrationUI;
import user.bankRegistrationUI;
import user.walletRegitstrationUI;


public class Main {
    public static void main(String[] args) {
        RegistrationUI walletRegistrationUI = new walletRegitstrationUI();
        System.out.println("Testing Wallet Registration:");
        walletRegistrationUI.registrationTemplate();

        RegistrationUI BankRegistrationUI = new bankRegistrationUI();
        System.out.println("Testing Bank Registration:");
        BankRegistrationUI.registrationTemplate();
    }
}



