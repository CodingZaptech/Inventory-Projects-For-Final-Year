// Service.java
// Business logic for Reminder Inventory System

import java.util.*;

public class Service {
    private Map<String, Model> inventory = new HashMap<>();

    public void addItem(Model item) {
        inventory.put(item.getItemId(), item);
        System.out.println("Item added: " + item);
    }

    public void updateQuantity(String id, int qty) {
        if (inventory.containsKey(id)) {
            Model item = inventory.get(id);
            item.setQuantity(qty);
            System.out.println("Updated: " + item);
        } else {
            System.out.println("Item not found.");
        }
    }

    public void checkReminders() {
        System.out.println("--- Reminder Check ---");
        for (Model item : inventory.values()) {
            if (item.getQuantity() <= item.getThreshold()) {
                System.out.println("Reminder: Restock " + item.getName() + " (Qty: " + item.getQuantity() + ")");
            }
        }
    }
}
