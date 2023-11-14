import API.waterCompanies;
import database.*;
import fakeAPI.Bank1;
import fakeAPI.BankAPI;
import transfer.*;
import user.*;

public class Main {

    public static void main(String[] args) {
//        database.saveData(bankuser);

        Transfer transfer = new WalletTransfer();
        User bankuser = new BankUser("hoda","password123",3000.0,"123456789","bank","156789012345678901");
        User walletuser= new WalletUser("hoda","password123",1000.0,"01018360646","wallet","Wallet1");
          OptionsUI optionsUI = new OptionsUI();
        optionsUI.optionsMenu(bankuser);
}}



