package UI;

import transfer.TransferManager;

public class TransfersUIFactoryConcrete implements TransfersUIFactory {
    @Override
    public TransferUI create(String num, TransferManager xx) {
        switch (num) {
            case "1":
                return new WalletTransferUI(xx);
            case "2":
                return new PayEaseTransferUI(xx);
            case "3":
                return new BankTransferUI(xx);
            default:
                return null;
        }
    }
}
