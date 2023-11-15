package UI;

public class TransfersUIFactoryConcrete implements TransfersUIFactory {
    @Override
    public TransferUI create(String num) {
        switch (num) {
            case "1":
                return new WalletTransferUI();
            case "2":
                return new PayEaseTransferUI();
            case "3":
                return new BankTransferUI();
            default:
                return null;
        }
    }
}
