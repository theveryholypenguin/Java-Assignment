package assignment;

public class Main {

    public static void main(String[] args) {

        InventoryItem item1 = new InventoryItem("Laptop", 10);
        InventoryItem item2 = new InventoryItem("Mouse", 20);

        item1.addToInventory(5);
        item2.removeFromInventory(3);

        System.out.println("Total items in stock: " 
                + InventoryItem.getTotalItems());
    }
}