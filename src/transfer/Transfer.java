package transfer;
import fakeAPI.*;
import user.*;

public  interface Transfer {
    public  boolean transfer(double amount,String[] restData, User user);
    public boolean checkAccount(String[] restData, User user) ;
}
