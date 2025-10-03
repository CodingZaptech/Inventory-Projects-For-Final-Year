// Controller.java
// Handles interactions for Automatic Reminder Inventory System

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Reminder Inventory System ---");
            System.out.println("1. Add Item");
            System.out.println("2. Update Quantity");
            System.out.println("3. Check Reminders");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Item ID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Threshold: ");
                    int th = sc.nextInt();
                    service.addItem(new Model(id, name, qty, th));
                    break;
                case 2:
                    System.out.print("Item ID: ");
                    String uid = sc.nextLine();
                    System.out.print("New Quantity: ");
                    int newQty = sc.nextInt();
                    service.updateQuantity(uid, newQty);
                    break;
                case 3:
                    service.checkReminders();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    sc.close();
                    System.exit(0);
            }
        }
    }
}
