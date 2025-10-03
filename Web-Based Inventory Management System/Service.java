// Service.java
// Business logic for Web-Based Inventory System

import java.util.*;

public class Service {
    private Map<String, Model> inventory = new HashMap<>();

    public void addItem(Model item) {
        inventory.put(item.getItemId(), item);
        System.out.println("Item added: " + item);
    }

    public void updateQuantity(String id, int qty) {
        if (inventory.containsKey(id)) {
            inventory.get(id).setQuantity(qty);
            System.out.println("Updated: " + inventory.get(id));
        } else {
            System.out.println("Item not found.");
        }
    }

    public void displayInventory() {
        System.out.println("--- Inventory ---");
        for (Model item : inventory.values()) {
            System.out.println(item);
        }
    }
}
