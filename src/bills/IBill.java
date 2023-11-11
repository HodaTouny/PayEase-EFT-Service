package bills;

public interface IBill {

    double amount = 0;
    String dueDate = "";
    void createBill();
    //void performPayment(IUser user);
}
