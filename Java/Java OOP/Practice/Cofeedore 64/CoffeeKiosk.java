import java.util.ArrayList;
import java.util.Scanner;
public class CoffeeKiosk {

    private ArrayList<Item> menu;
    private ArrayList<Order> orders;
    
    public CoffeeKiosk() {
        menu= new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }

    public void addMenuItem(String name,double price){
        Item newItem = new Item(name, price);
        menu.add(newItem);
        int index = menu.size() - 1;
        newItem.setIndex(index);
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (Item item : menu) {
            System.out.println(item.getIndex() + " " + item.getName() + " -- $" + item.getPrice());
        }
    }
    public void newOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter customer name for new order:");
        String name = scanner.nextLine();
        Order newOrder = new Order(name);
        displayMenu();

        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = scanner.nextLine();

        while (!itemNumber.equals("q")) {
            try {
                int index = Integer.parseInt(itemNumber);
                if (index >= 0 && index < menu.size()) {
                    newOrder.addItem(menu.get(index));
                } else {
                    System.out.println("Invalid item index. Please enter a valid index.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid item index or 'q' to quit.");
            }
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = scanner.nextLine();
        }
        System.out.println("Order details:");
        System.out.println(newOrder);
    }
}