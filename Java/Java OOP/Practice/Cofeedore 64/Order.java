import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customerName;
    private List<Item> items;

    public Order(String customerName) {
        this.customerName = customerName;
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Customer Name: ").append(customerName).append("\n");
        builder.append("Items:\n");
        for (Item item : items) {
            builder.append("- ").append(item).append("\n");
        }
        return builder.toString();
    }
}
