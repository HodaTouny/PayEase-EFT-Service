package transfer;

public class TransfersUIFactoryConcrete implements TransfersUIFactory{
    @Override
    public TransferUI create(String num) {
        if (num.equals("1")) {
            return new WalletTransferUI();
        } else if (num.equals("2")) {
            return new PayEaseTransferUI();
        } else if (num.equals("3")) {
            return new BankTransferUI();
        } else {
            return null;
        }
    }
}
