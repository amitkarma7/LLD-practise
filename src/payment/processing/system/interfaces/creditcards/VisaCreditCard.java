package payment.processing.system.interfaces.creditcards;

import payment.processing.system.entities.Order;

public class VisaCreditCard implements CreditCard{

    @Override
    public void doPayment(Order order) {
        System.out.println("Visa credit card payment : " + order);

    }
}
