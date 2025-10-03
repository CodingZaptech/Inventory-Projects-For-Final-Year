// Model.java
// Defines entities for RFID-based Inventory Management System

public class Model {
    private String rfidTag;   // Unique RFID Tag ID
    private String name;      // Item name
    private int quantity;     // Stock quantity
    private double price;     // Price per unit

    // Constructor
    public Model(String rfidTag, String name, int quantity, double price) {
        this.rfidTag = rfidTag;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters
    public String getRfidTag() {
        return rfidTag;
    }

    public void setRfidTag(String rfidTag) {
        this.rfidTag = rfidTag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "RFID: " + rfidTag + ", Name: " + name + ", Quantity: " + quantity + ", Price: " + price;
    }
}
