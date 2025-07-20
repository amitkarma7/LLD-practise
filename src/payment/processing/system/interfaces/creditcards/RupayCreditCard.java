package payment.processing.system.interfaces.creditcards;

import payment.processing.system.entities.Order;

public class RupayCreditCard implements CreditCard{

    @Override
    public void doPayment(Order order) {
        System.out.println("Rupay credit card payment : " + order);

    }
}
