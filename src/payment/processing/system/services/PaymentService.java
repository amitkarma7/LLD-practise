package payment.processing.system.services;

import payment.processing.system.entities.Item;
import payment.processing.system.entities.Order;
import payment.processing.system.entities.Payment;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PaymentService {


     public void doCalculateTotalPayment(Order order) {
         List<Item> items =  order.getItems();

         AtomicInteger finalTotalAmount = new AtomicInteger();
         items.stream().forEach(element -> {
             finalTotalAmount.set(finalTotalAmount.get()+element.getAmountValue());
         });
         order.getPayment().setTotalPayment(finalTotalAmount.get());
     }
}
