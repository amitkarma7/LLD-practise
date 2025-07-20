package payment.processing.system;

import payment.processing.system.entities.Discount;
import payment.processing.system.entities.Item;
import payment.processing.system.entities.Order;
import payment.processing.system.entities.Payment;
import payment.processing.system.interfaces.PaymentType;
import payment.processing.system.interfaces.creditcards.MasterCreditCard;
import payment.processing.system.services.PaymentService;
import payment.processing.system.services.ReceiptPrinterService;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessorMain {

    public static void main(String[] args) {

        List<Item> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new Item(i+1, "Item name - " + i, 10+ i));
        }
        Order order = new Order(1, list, new Payment(), new Discount(20));
        OrderProcessor orderProcessor =new OrderProcessor(new PaymentService() , new ReceiptPrinterService());
        PaymentType paymentType =new MasterCreditCard();
        orderProcessor.processOrder(order , paymentType);
        orderProcessor.printReceipt(order);
    }
}
