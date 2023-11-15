package inquery;

public interface InquireFactory {
    BalanceInquire create(String type);
}
