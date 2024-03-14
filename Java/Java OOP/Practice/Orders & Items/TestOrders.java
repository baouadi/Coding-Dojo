import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
    Item item1 = new Item();
    Item item2 = new Item();
    Item item3 = new Item();
    Item item4 = new Item();
    item1.name="mocha";
    item2.name="latte";
    item3.name="drip coffee";
    item4.name="cappuccino";
    item1.price=1.5;
    item2.price=2.5;
    item3.price=4;
    item4.price=5.5;

    Order order1 = new Order();
    Order order2 = new Order();
    Order order3 = new Order();
    Order order4 = new Order();
    order1.name="Cindhuri";
    order2.name="Jimmy";
    order3.name="Noah";
    order4.name="Sam";

    order2.items.add(item1);
    order3.items.add(item4);
    order3.total+=item4.price;
    order4.items.add(item2);
    order1.ready=true;
    order2.ready=true;
    order3.ready=true;
System.out.println(order3.total);
    
    
    
System.out.printf("Name: %s\n", order3.name);
System.out.printf("Total: %s\n", order3.total);
System.out.printf("Ready: %s\n", order3.ready);
    }
}

