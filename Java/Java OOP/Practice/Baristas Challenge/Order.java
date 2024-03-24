import java.util.ArrayList;
public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Items> items = new ArrayList<>();

    //Constructor
    public Order() {
        this.name="Guest";
        this.items = new ArrayList<>();
    }
    //Overloaded Constructor
    public Order(String name){
        this.name= name;
    }

    //Methodes
    public void addItem(Items item) {
        items.add(item);
    }

    public String getStatusMessage(){
        String message;
        if (ready){
            message ="Your order is ready";
        }
        else{
            message ="Thank you for waiting. Your order will be ready soon.";
        }
    return message;
    }

public double getOrderTotal() {
    double total = 0.0;
    for (Items item : items) {
        total += item.getPrice();
    }
    return total;
}


public void display() {
    System.out.println("Customer Name: " + name);
    double total = 0.0;
    for (Items item : items) {
        System.out.println(item.getName() + " - $" + item.getPrice());
        total += item.getPrice();
    }
    System.out.println("Total: $" + String.format("%.2f", total));
}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }
}
