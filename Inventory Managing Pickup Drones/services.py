# services.py
# Business logic for Pickup Drone-based Inventory Management

class DroneInventoryService:
    def __init__(self):
        # {drone_id: {"item": str, "status": str}}
        self.drones = {}

    def register_drone(self, drone_id, item):
        self.drones[drone_id] = {"item": item, "status": "Idle"}
        print(f"Drone {drone_id} registered for item {item}.")

    def assign_pickup(self, drone_id):
        if drone_id in self.drones:
            self.drones[drone_id]["status"] = "In Transit"
            print(f"Drone {drone_id} is picking up {self.drones[drone_id]['item']}.")
        else:
            print("Drone not found.")

    def update_status(self, drone_id, status):
        if drone_id in self.drones:
            self.drones[drone_id]["status"] = status
            print(f"Drone {drone_id} updated to {status}.")
        else:
            print("Drone not found.")

    def display_drones(self):
        for drone_id, info in self.drones.items():
            print(f"Drone {drone_id} -> Item: {info['item']}, Status: {info['status']}")
