package payment.processing.system.interfaces.paypal;

import payment.processing.system.entities.Order;

public class PaypalImpl implements Paypal{

    @Override
    public void doPayment(Order order) {
        System.out.println("Paypal payment : " + order);
    }
}
