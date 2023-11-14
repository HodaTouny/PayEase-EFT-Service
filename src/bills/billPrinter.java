package bills;

public class billPrinter {
    public void printBill(String[] bill){
        System.out.println("Your Bill:  ");
        System.out.println("Crn:        " + bill[0]);
        System.out.println("Name:       " + bill[1]);
        System.out.println("Due Date:   " + bill[3]);
        System.out.println("Bill Usage: " + bill[4]);
        System.out.println("Value:      " + bill[2]);


    }
}
