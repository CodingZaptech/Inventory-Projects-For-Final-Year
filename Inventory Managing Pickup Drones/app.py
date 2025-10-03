# app.py
# Controller for Pickup Drone-based Inventory Management

from services import DroneInventoryService

def main():
    service = DroneInventoryService()

    while True:
        print("\n--- Pickup Drone Inventory System ---")
        print("1. Register Drone")
        print("2. Assign Pickup")
        print("3. Update Drone Status")
        print("4. Display Drones")
        print("5. Exit")

        choice = input("Choice: ")

        if choice == "1":
            drone_id = input("Drone ID: ")
            item = input("Item: ")
            service.register_drone(drone_id, item)

        elif choice == "2":
            drone_id = input("Drone ID: ")
            service.assign_pickup(drone_id)

        elif choice == "3":
            drone_id = input("Drone ID: ")
            status = input("New Status: ")
            service.update_status(drone_id, status)

        elif choice == "4":
            service.display_drones()

        elif choice == "5":
            print("Exiting...")
            break

        else:
            print("Invalid choice.")

if __name__ == "__main__":
    main()
