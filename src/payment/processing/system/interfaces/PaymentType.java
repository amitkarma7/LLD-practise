package payment.processing.system.interfaces;

import payment.processing.system.entities.Order;

public interface PaymentType {
    void doPayment(Order order);
}
