package payment.processing.system.entities;

import java.util.List;

public class Order {
    private int orderId;
    private List<Item> items;
    private Payment payment;
    private Discount discount;


    public Order(int orderId,  List<Item> items,Payment payment, Discount discount) {
        this.orderId = orderId;
        this.items = items;
        this.payment = payment;
        this.discount = discount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", items=" + items +
                ", payment=" + payment +
                ", discount=" + discount +
                '}';
    }
}
