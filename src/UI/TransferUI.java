package UI;

import transfer.TransferManager;

import java.util.Scanner;

public abstract class TransferUI {
    TransferManager transferManager;

    public TransferUI(TransferManager transferManage) {
        transferManager = transferManage;
    }

    public void transferUITemplate(String[] user) {
        Scanner scanner = new Scanner(System.in);
        String restData = getRestData();
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Do you agree on sending " + amount + " to " + restData + "? (yes/no)");
        String confirmation = scanner.nextLine().trim().toLowerCase();

        if (confirmation.equals("yes")) {
            if (transfer(amount, restData, user)) {
                System.out.println("Transfer done successfully");
            } else {
                System.out.println("Transfer failed");
            }
        } else {
            System.out.println("Transfer canceled by user.");
        }
    }

    public abstract String getRestData();

    public abstract boolean transfer(double amount, String restData, String[] user);
}
