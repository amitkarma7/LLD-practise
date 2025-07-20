package payment.processing.system.interfaces.creditcards;

import payment.processing.system.entities.Order;

public class MasterCreditCard implements CreditCard{

    @Override
    public void doPayment(Order order) {
        System.out.println("Master credit card payment : " + order);
    }
}
