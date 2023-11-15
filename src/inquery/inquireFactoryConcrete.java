package inquery;

public class inquireFactoryConcrete implements InquireFactory {
    @Override
    public BalanceInquire create(String type) {
        if ("bank".equals(type)) {
            return new BankInquireConcrete();
        } else if ("wallet".equals(type)) {
            return new WalletInquireConcrete();
        }
        return null;
    }
}
