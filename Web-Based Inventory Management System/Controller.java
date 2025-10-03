// Controller.java
// Simulated backend controller for Web-Based Inventory System

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Web Inventory System ---");
            System.out.println("1. Add Item");
            System.out.println("2. Update Quantity");
            System.out.println("3. Display Inventory");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Item ID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    service.addItem(new Model(id, name, qty));
                    break;
                case 2:
                    System.out.print("Item ID: ");
                    String uid = sc.nextLine();
                    System.out.print("New Quantity: ");
                    int q = sc.nextInt();
                    service.updateQuantity(uid, q);
                    break;
                case 3:
                    service.displayInventory();
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
            }
        }
    }
}
