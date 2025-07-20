package payment.processing.system.entities;

public class Discount {
    private int discountAmount;

    public Discount(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "discountAmount=" + discountAmount +
                '}';
    }
}
