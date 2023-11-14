package UI;

public class BillsFactoryUiConcrete implements BillsFactoryUI{
    public BillPaymentUI create(String num){
        if("1".equals(num)){
            return new electricityPaymentUI();
        }else if("2".equals(num)){
            return new gasPaymentUI();
        }else if("3".equals(num)){
            return new waterPaymentUI();
        }
        return null;
    }
}
