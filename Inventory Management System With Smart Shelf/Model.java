// Model.java
// Defines entities for Smart Shelf Inventory System

public class Model {
    private String shelfId;
    private String itemName;
    private int quantity;

    public Model(String shelfId, String itemName, int quantity) {
        this.shelfId = shelfId;
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public String getShelfId() { return shelfId; }
    public String getItemName() { return itemName; }
    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return "Shelf: " + shelfId + ", Item: " + itemName + ", Quantity: " + quantity;
    }
}
