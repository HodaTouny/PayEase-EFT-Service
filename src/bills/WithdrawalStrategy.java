package bills;

public interface WithdrawalStrategy {
    boolean withdraw(String identifier, double amount);
}
