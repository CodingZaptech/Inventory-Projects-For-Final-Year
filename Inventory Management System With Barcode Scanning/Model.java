// Model.java
// Defines the data structures/entities for Inventory Management System with Barcode Scanning

public class Model {
    private String itemId;        // Unique item ID
    private String name;          // Item name
    private String barcode;       // Barcode of the item
    private int quantity;         // Stock quantity
    private double price;         // Price per unit

    // Constructor
    public Model(String itemId, String name, String barcode, int quantity, double price) {
        this.itemId = itemId;
        this.name = name;
        this.barcode = barcode;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Utility method to display item details
    @Override
    public String toString() {
        return "ItemID: " + itemId + ", Name: " + name + ", Barcode: " + barcode + 
               ", Quantity: " + quantity + ", Price: " + price;
    }
}
