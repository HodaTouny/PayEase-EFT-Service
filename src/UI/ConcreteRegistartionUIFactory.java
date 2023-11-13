package UI;

import UI.RegistartionUiFactory;
import UI.RegistrationUI;
import UI.bankRegistrationUI;
import UI.walletRegitstrationUI;

public class ConcreteRegistartionUIFactory implements RegistartionUiFactory {
    @Override
    public RegistrationUI createReg(int choice) {
        if(choice == 1){
            return new walletRegitstrationUI();
        }else if(choice == 2){
            return new bankRegistrationUI();
        }else{
            throw new IllegalArgumentException("Invalid Registration Option.");
        }
    }
}
