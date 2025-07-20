package payment.processing.system.entities;

public class Item {

    private int itemNumber;
    private String itemName;
    private int amountValue;

    public Item(int itemNumber, String itemName, int amountValue) {
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.amountValue = amountValue;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getAmountValue() {
        return amountValue;
    }

    public void setAmountValue(int amountValue) {
        this.amountValue = amountValue;
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemNumber=" + itemNumber +
                ", itemName='" + itemName + '\'' +
                ", amountValue=" + amountValue +
                '}';
    }
}
