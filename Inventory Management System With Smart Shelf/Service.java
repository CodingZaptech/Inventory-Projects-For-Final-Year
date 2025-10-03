// Service.java
// Business logic for Smart Shelf Inventory System

import java.util.*;

public class Service {
    private Map<String, Model> shelves = new HashMap<>();

    public void addShelf(Model shelf) {
        shelves.put(shelf.getShelfId(), shelf);
        System.out.println("Shelf added: " + shelf);
    }

    public void updateQuantity(String shelfId, int qty) {
        if (shelves.containsKey(shelfId)) {
            shelves.get(shelfId).setQuantity(qty);
            System.out.println("Updated: " + shelves.get(shelfId));
        } else {
            System.out.println("Shelf not found.");
        }
    }

    public void monitorShelves() {
        System.out.println("--- Smart Shelf Monitoring ---");
        for (Model shelf : shelves.values()) {
            if (shelf.getQuantity() < 5) { // simple alert rule
                System.out.println("Alert: Low stock on " + shelf);
            }
        }
    }
}
