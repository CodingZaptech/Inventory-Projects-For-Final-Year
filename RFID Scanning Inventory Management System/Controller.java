// Controller.java
// Handles interactions for RFID Inventory Management

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- RFID Inventory Management ---");
            System.out.println("1. Add Item");
            System.out.println("2. Scan RFID Tag");
            System.out.println("3. Display Inventory");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter RFID Tag: ");
                    String rfid = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    Model item = new Model(rfid, name, qty, price);
                    service.addItem(item);
                    break;
                case 2:
                    System.out.print("Enter RFID Tag: ");
                    String tag = scanner.nextLine();
                    Model found = service.scanRfid(tag);
                    if (found != null) System.out.println("Found: " + found);
                    else System.out.println("Item not found.");
                    break;
                case 3:
                    service.displayInventory();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
            }
        }
    }
}
