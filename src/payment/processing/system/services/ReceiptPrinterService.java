package payment.processing.system.services;

import payment.processing.system.entities.Order;

public class ReceiptPrinterService {

    public void doPrint(Order order) {
        System.out.println("Print Receipt " + order);
    }
}
