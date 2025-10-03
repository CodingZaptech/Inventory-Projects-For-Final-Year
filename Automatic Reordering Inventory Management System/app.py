# app.py
# Controller for Automatic Reordering Inventory System

from services import InventoryService

def main():
    service = InventoryService()

    while True:
        print("\n--- Automatic Reordering Inventory System ---")
        print("1. Add Item")
        print("2. Update Quantity")
        print("3. Check Reorder List")
        print("4. Exit")

        choice = input("Enter choice: ")

        if choice == "1":
            item_id = input("Item ID: ")
            name = input("Name: ")
            qty = int(input("Quantity: "))
            threshold = int(input("Reorder Threshold: "))
            service.add_item(item_id, name, qty, threshold)

        elif choice == "2":
            item_id = input("Item ID: ")
            qty = int(input("New Quantity: "))
            service.update_quantity(item_id, qty)

        elif choice == "3":
            reorder = service.check_reorder()
            if reorder:
                print("Items to reorder:")
                for item in reorder:
                    print(f"ID: {item[0]}, Name: {item[1]}")
            else:
                print("No items need reordering.")

        elif choice == "4":
            print("Exiting...")
            break

        else:
            print("Invalid choice.")

if __name__ == "__main__":
    main()
