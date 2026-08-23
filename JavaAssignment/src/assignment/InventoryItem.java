package assignment;

public class InventoryItem {

    static int totalItems = 0;

    String itemName;
    int quantity;

    public InventoryItem(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
        totalItems += quantity;
    }

    public static int getTotalItems() {
        return totalItems;
    }

    public void addToInventory(int amount) {
        quantity += amount;
        totalItems += amount;
    }

    public void removeFromInventory(int amount) {
        quantity -= amount;
        totalItems -= amount;
    }
}