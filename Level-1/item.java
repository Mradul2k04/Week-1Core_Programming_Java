public class item {
    private int itemcode;
    private String itemName;
    private double price;
     
    public item(int itemcode, String itemName, double price){
        this.itemcode = itemcode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails(int quantity) {
        System.out.println("Item Code: " + itemcode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per item: " + price);
        double totalPrice = price * quantity;
        System.out.println("Quantity bought: " + quantity);
        System.out.println("Total Price: " + totalPrice);
    }
    public static void main(String args[]){
        item i1 = new item(23,"Book",500);
        item i2 = new item(24,"pen",30);
        System.out.println("Item 1 = ");
        i1.displayDetails(5);
        
    }
}