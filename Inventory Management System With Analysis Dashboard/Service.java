// Service.java
// Business logic for Analysis Dashboard Inventory System

import java.util.*;

public class Service {
    private Map<String, Model> inventory = new HashMap<>();

    public void addItem(Model item) {
        inventory.put(item.getItemId(), item);
        System.out.println("Added: " + item);
    }

    public void generateReport() {
        System.out.println("--- Inventory Dashboard ---");
        int totalItems = inventory.size();
        int totalQuantity = 0;
        double totalValue = 0;

        for (Model item : inventory.values()) {
            totalQuantity += item.getQuantity();
            totalValue += item.getQuantity() * item.getPrice();
        }

        System.out.println("Total Items: " + totalItems);
        System.out.println("Total Quantity: " + totalQuantity);
        System.out.println("Total Inventory Value: $" + totalValue);
    }
}
