// Service.java
// Business logic for Expiry Date Tracking Inventory System

import java.time.LocalDate;
import java.util.*;

public class Service {
    private Map<String, Model> inventory = new HashMap<>();

    public void addItem(Model item) {
        inventory.put(item.getItemId(), item);
        System.out.println("Added: " + item);
    }

    public void checkExpiry() {
        System.out.println("--- Expiry Check ---");
        LocalDate today = LocalDate.now();
        for (Model item : inventory.values()) {
            if (item.getExpiryDate().isBefore(today.plusDays(7))) {
                System.out.println("Alert: " + item.getName() + " expiring soon on " + item.getExpiryDate());
            }
        }
    }
}
