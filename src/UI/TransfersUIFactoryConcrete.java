package UI;

import transfer.TransferManager;

public class TransfersUIFactoryConcrete implements TransfersUIFactory {
    @Override
    public TransferUI create(String num, TransferManager transferManager) {
        switch (num) {
            case "1":
                return new WalletTransferUI(transferManager);
            case "2":
                return new PayEaseTransferUI(transferManager);
            case "3":
                return new BankTransferUI(transferManager);
            default:
                return null;
        }
    }
}
