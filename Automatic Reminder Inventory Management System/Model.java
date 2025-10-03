// Model.java
// Defines entities for Automatic Reminder Inventory Management System

public class Model {
    private String itemId;
    private String name;
    private int quantity;
    private int threshold; // When to remind

    public Model(String itemId, String name, int quantity, int threshold) {
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.threshold = threshold;
    }

    public String getItemId() { return itemId; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public int getThreshold() { return threshold; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return "ID: " + itemId + ", Name: " + name + ", Quantity: " + quantity + ", Threshold: " + threshold;
    }
}
