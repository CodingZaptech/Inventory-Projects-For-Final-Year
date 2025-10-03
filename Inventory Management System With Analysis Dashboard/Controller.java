// Controller.java
// Backend controller for Analysis Dashboard Inventory System

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Analysis Dashboard Inventory ---");
            System.out.println("1. Add Item");
            System.out.println("2. Generate Dashboard Report");
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
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    service.addItem(new Model(id, name, qty, price));
                    break;
                case 2:
                    service.generateReport();
                    break;
                case 3:
                    sc.close();
                    System.exit(0);
            }
        }
    }
}
