# services.py
# Business logic for Automatic Reordering Inventory System

class InventoryService:
    def __init__(self):
        # Store items as {id: {"name": str, "qty": int, "threshold": int}}
        self.inventory = {}

    def add_item(self, item_id, name, qty, threshold):
        self.inventory[item_id] = {"name": name, "qty": qty, "threshold": threshold}
        print(f"Item added: {self.inventory[item_id]}")

    def update_quantity(self, item_id, qty):
        if item_id in self.inventory:
            self.inventory[item_id]["qty"] = qty
            print(f"Updated: {self.inventory[item_id]}")
        else:
            print("Item not found.")

    def check_reorder(self):
        reorder_list = []
        for item_id, data in self.inventory.items():
            if data["qty"] <= data["threshold"]:
                reorder_list.append((item_id, data["name"]))
        return reorder_list
