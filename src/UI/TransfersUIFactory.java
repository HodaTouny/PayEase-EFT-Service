package UI;

import transfer.TransferManager;

public interface TransfersUIFactory {
    public TransferUI create(String num, TransferManager transferManager);
}
