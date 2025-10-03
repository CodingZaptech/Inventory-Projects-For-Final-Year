// Model.java
// Entity for Expiry Date Tracking Inventory System

import java.time.LocalDate;

public class Model {
    private String itemId;
    private String name;
    private int quantity;
    private LocalDate expiryDate;

    public Model(String itemId, String name, int quantity, LocalDate expiryDate) {
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    public String getItemId() { return itemId; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public LocalDate getExpiryDate() { return expiryDate; }

    @Override
    public String toString() {
        return "ID: " + itemId + ", Name: " + name + ", Quantity: " + quantity + ", Expiry: " + expiryDate;
    }
}
