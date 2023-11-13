package bills;

import user.User;

public interface IBill {

    double amount = 0;
    String dueDate = "";
    void createBill();
    void performPayment(User user);
}
