// Model.java
// Entity for Mobile-Based Inventory Management

public class Model {
    private String itemId;
    private String name;
    private int quantity;

    public Model(String itemId, String name, int quantity) {
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
    }

    public String getItemId() { return itemId; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return "ID: " + itemId + ", Name: " + name + ", Quantity: " + quantity;
    }
}
