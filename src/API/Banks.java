package API;

import fakeAPI.Bank1;
import fakeAPI.BankAPI;
import fakeAPI.WalletAPI;
import org.jetbrains.annotations.NotNull;

public enum Banks {
    BANK1("10000", "19999") {
        @Override
        public BankAPI createBank() {
            return new Bank1();
        }

    };
    private final String startRange;
    private final String endRange;
    Banks(String startRange, String endRange) {
        this.startRange = startRange;
        this.endRange = endRange;
    }

    public boolean isInRange(String prefix) {
        int intValue = Integer.parseInt(prefix);
        int startValue = Integer.parseInt(startRange);
        int endValue = Integer.parseInt(endRange);

        return intValue >= startValue && intValue <= endValue;
    }

    public abstract BankAPI createBank();


    public boolean APIVerification(String creditCardNumber,String phone) {
        if (isInRange(creditCardNumber.substring(0, 5))) {
            BankAPI bankAPI = createBank();
            return bankAPI.verifyUser(creditCardNumber, phone);
        }
        return false;
    }
    public boolean APIVerification( String creditCardNumber) {
        if (isInRange(creditCardNumber.substring(0, 5))) {
            BankAPI bankAPI = createBank();
            return bankAPI.verifyUser(creditCardNumber);
        }
        return false;
    }

    public boolean withdraw(String creditCardNumber, double amount) {
        if (isInRange(creditCardNumber.substring(0, 5))) {
            BankAPI bankAPI = createBank();
            return bankAPI.withdraw(creditCardNumber, amount);
        }
        return false;
    }
    public boolean deposit(String creditCardNumber, double amount) {
        if (isInRange(creditCardNumber.substring(0, 5))) {
            BankAPI bankAPI = createBank();
            return bankAPI.deposit(creditCardNumber, amount);
        }
        return false;
    }

}

