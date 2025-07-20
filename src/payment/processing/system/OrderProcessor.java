package payment.processing.system;

import payment.processing.system.entities.Order;
import payment.processing.system.entities.Payment;
import payment.processing.system.interfaces.PaymentType;
import payment.processing.system.services.PaymentService;
import payment.processing.system.services.ReceiptPrinterService;

public class OrderProcessor {

    private PaymentService paymentService;
    private ReceiptPrinterService printer;

    public OrderProcessor(PaymentService paymentService , ReceiptPrinterService printer) {
        this.paymentService = paymentService;
        this.printer = printer;
    }

    public void processOrder(Order order, PaymentType paymentType) {
        paymentService.doCalculateTotalPayment(order);
        paymentType.doPayment(order);
    }

    public void printReceipt(Order order) {
        // Format and print order details
        printer.doPrint(order);
    }
}