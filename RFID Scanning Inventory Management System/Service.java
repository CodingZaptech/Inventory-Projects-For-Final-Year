// Service.java
// Business logic for RFID Inventory Management

import java.util.HashMap;
import java.util.Map;

public class Service {
    private Map<String, Model> inventory = new HashMap<>();

    // Add new item
    public void addItem(Model item) {
        inventory.put(item.getRfidTag(), item);
        System.out.println("Added: " + item);
    }

    // Scan RFID to fetch item
    public Model scanRfid(String rfidTag) {
        return inventory.get(rfidTag);
    }

    // Display all items
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory empty.");
        } else {
            System.out.println("--- Inventory ---");
            for (Model item : inventory.values()) {
                System.out.println(item);
            }
        }
    }
}
