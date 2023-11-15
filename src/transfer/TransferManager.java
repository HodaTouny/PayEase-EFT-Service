package transfer;

public class TransferManager {
    Transfer Transfer;
    public void setTransfer(Transfer transfer){
        Transfer = transfer;
    }
    public boolean TransferMoney(double amount, String restData, String[] user){
        return Transfer.transfer(amount, restData, user);
    }

}
