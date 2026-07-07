class Item {

    private String name;
    private double price;

 
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}


class Order {

    private Item item1;
    private Item item2;


    public Order(Item item1, Item item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public void printBill() {

        double total = item1.getPrice() + item2.getPrice();

        System.out.println("========= E-Commerce Bill =========");
        System.out.println("Item 1: " + item1.getName() + " - $" + item1.getPrice());
        System.out.println("Item 2: " + item2.getName() + " - $" + item2.getPrice());
        System.out.println("-----------------------------------");
        System.out.println("Total Cost: $" + total);
    }
}


public class Main {

    public static void main(String[] args) {

     
        Item mouse = new Item("Mouse", 20.0);
        Item keyboard = new Item("Keyboard", 45.0);


        Order order = new Order(mouse, keyboard);

       
        order.printBill();
    }
}
