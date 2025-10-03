// Controller.java
// Handles interactions for Smart Shelf Inventory System

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Smart Shelf Inventory ---");
            System.out.println("1. Add Shelf");
            System.out.println("2. Update Shelf Quantity");
            System.out.println("3. Monitor Shelves");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Shelf ID: ");
                    String id = sc.nextLine();
                    System.out.print("Item Name: ");
                    String item = sc.nextLine();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    service.addShelf(new Model(id, item, qty));
                    break;
                case 2:
                    System.out.print("Shelf ID: ");
                    String sid = sc.nextLine();
                    System.out.print("New Quantity: ");
                    int newQty = sc.nextInt();
                    service.updateQuantity(sid, newQty);
                    break;
                case 3:
                    service.monitorShelves();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
            }
        }
    }
}
