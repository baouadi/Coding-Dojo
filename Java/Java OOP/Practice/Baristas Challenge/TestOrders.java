public class TestOrders {

    public static void main(String[] args) {
        
    Order order1=new Order();
    Order order2=new Order();
    Order order4=new Order("First");
    Order order5=new Order("seconde");
    Order order6=new Order("third");



    Items item1 = new Items("drip coffee", 1.50);
        Items item2 = new Items("cappuccino", 3.50);
        order1.addItem(item1);
        order1.addItem(item2);

        Items item3 = new Items("latte", 2.75);
        Items item4 = new Items("espresso", 2.00);
        order2.addItem(item3);
        order2.addItem(item4);

    
        System.out.println("Order 1:");
        order1.display();
        System.out.println();

        System.out.println("Order 2:");
        order2.display();
        System.out.println();


        System.out.println("Order 1 Total: $" + order1.getOrderTotal());
        System.out.println("Order 2 Total: $" + order2.getOrderTotal());
        System.out.println();

        System.out.println("Order 1 Status: " + order1.getStatusMessage());
        System.out.println("Order 2 Status: " + order2.getStatusMessage());


    }
}
