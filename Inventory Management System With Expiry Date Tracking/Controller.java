// Controller.java
// Backend controller for Expiry Tracking Inventory System

import java.util.Scanner;
import java.time.LocalDate;

public class Controller {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Expiry Date Inventory ---");
            System.out.println("1. Add Item");
            System.out.println("2. Check Expiry Alerts");
            System.out.println("3. Exit");
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
                    sc.nextLine();
                    System.out.print("Expiry Date (YYYY-MM-DD): ");
                    String date = sc.nextLine();
                    service.addItem(new Model(id, name, qty, LocalDate.parse(date)));
                    break;
                case 2:
                    service.checkExpiry();
                    break;
                case 3:
                    sc.close();
                    System.exit(0);
            }
        }
    }
}
