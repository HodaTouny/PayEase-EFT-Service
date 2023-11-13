package bills;

public interface IBill {

    double amount = 0;
    String dueDate = "";
    String createBill(String crn);

}
