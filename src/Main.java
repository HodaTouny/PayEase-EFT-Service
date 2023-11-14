<<<<<<< Updated upstream
import API.waterCompanies;
import database.FileDatabase;
import database.IDatabase;
import fakeAPI.Bank1;
import fakeAPI.BankAPI;
import transfer.*;
import user.*;
=======

import UI.BillPaymentUI;
>>>>>>> Stashed changes

import UI.PayEaseUI;
import UI.electricityPaymentUI;


public class Main {
<<<<<<< Updated upstream

    public static void main(String[] args) {
////        // TEST transfer
//        IDatabase database = new FileDatabase();
//        Transfer transfer = new WalletTransfer();
        User bankuser = new BankUser("hoda","password123",3000.0,"123456789","bank","100038888");
        User walletuser= new WalletUser("hoda","password123",1000.0,"01014857378","wallet","WAllet1");
//        String[] restData = {"Bank1","100038887"};
//        String[] restData2 = {"wallet1","01013845789"};
//        String[] restData3 = {"shahd"};
//        transfer.transfer(100,restData2,walletuser);
//        database.saveData(bankuser);
        OptionsUI optionsUI = new OptionsUI();
        optionsUI.optionsMenu(walletuser);


=======
  public static void main(String[] args) {
    PayEaseUI pay = new PayEaseUI();
    pay.payEaseMenu();
>>>>>>> Stashed changes
  }
}


