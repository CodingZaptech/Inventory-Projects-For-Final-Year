// Model.java
// Entity for Analysis Dashboard Inventory System

public class Model {
    private String itemId;
    private String name;
    private int quantity;
    private double price;

    public Model(String itemId, String name, int quantity, double price) {
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemId() { return itemId; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "ID: " + itemId + ", Name: " + name + ", Qty: " + quantity + ", Price: " + price;
    }
}
