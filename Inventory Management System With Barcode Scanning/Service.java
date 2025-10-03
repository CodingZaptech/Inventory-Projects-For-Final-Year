// Service.java
// Handles business logic for Inventory Management System with Barcode Scanning

import java.util.HashMap;
import java.util.Map;

public class Service {
    // A simple in-memory store for items (barcode → Model)
    private Map<String, Model> inventory = new HashMap<>();

    // Add a new item to inventory
    public void addItem(Model item) {
        inventory.put(item.getBarcode(), item);
        System.out.println("Item added: " + item);
    }

    // Update quantity based on barcode
    public void updateQuantity(String barcode, int quantity) {
        if (inventory.containsKey(barcode)) {
            Model item = inventory.get(barcode);
            item.setQuantity(quantity);
            System.out.println("Updated quantity for: " + item);
        } else {
            System.out.println("Item with barcode " + barcode + " not found.");
        }
    }

    // Search item by barcode
    public Model searchByBarcode(String barcode) {
        return inventory.get(barcode);
    }

    // Display all inventory
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("=== Inventory Items ===");
            for (Model item : inventory.values()) {
                System.out.println(item);
            }
        }
    }
}
