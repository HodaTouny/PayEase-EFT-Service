package transfer;

import user.*;
import java.util.Scanner;

public class OptionsUI {
    public void optionsMenu(User user) {
        System.out.println("0. Back");
        System.out.println("1. Check your account balance");
        System.out.println("2. Transfer to Wallet");
        System.out.println("3. Transfer to PayEase Account");
        if (user instanceof BankUser) {
            System.out.println("4. Transfer to Bank Account");
        }
        System.out.print("Choose an option: ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.nextLine();
        switch (option) {
            case 0:
                break;
            case 1:
                System.out.println("Your account balance is: " + user.getPayEase());
                break;
            case 2:
                TransferUI transferUI = new WalletTransferUI();
                transferUI.transferUITemplate(user);
                break;
            case 3:
                TransferUI transferUI2 = new PayEaseTransferUI();
                transferUI2.transferUITemplate(user);
                break;
            case 4:
                if (user instanceof BankUser) {
                    TransferUI transferUI3 = new BankTransferUI();
                    transferUI3.transferUITemplate(user);

                }
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

    }
}
