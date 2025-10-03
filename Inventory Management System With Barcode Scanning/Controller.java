// Controller.java
// Handles requests and interactions for Inventory Management System with Barcode Scanning

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Inventory Management System ---");
            System.out.println("1. Add Item");
            System.out.println("2. Update Quantity by Barcode");
            System.out.println("3. Search Item by Barcode");
            System.out.println("4. Display Inventory");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Item ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Barcode: ");
                    String barcode = scanner.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = scanner.nextInt();

                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();

                    Model item = new Model(id, name, barcode, qty, price);
                    service.addItem(item);
                    break;

                case 2:
                    System.out.print("Enter Barcode: ");
                    String bcode = scanner.nextLine();

                    System.out.print("Enter New Quantity: ");
                    int newQty = scanner.nextInt();

                    service.updateQuantity(bcode, newQty);
                    break;

                case 3:
                    System.out.print("Enter Barcode: ");
                    String searchBarcode = scanner.nextLine();

                    Model found = service.searchByBarcode(searchBarcode);
                    if (found != null) {
                        System.out.println("Item Found: " + found);
                    } else {
                        System.out.println("No item found with given barcode.");
                    }
                    break;

                case 4:
                    service.displayInventory();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
