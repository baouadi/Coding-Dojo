import java.util.ArrayList;

public class CafeUtil {

    int sum = 0;

    public Integer getStreakGoal() {
        for (int i = 0; i < 11; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] array) {
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    static void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d %s\n", i, menuItems.get(i));
        }
    }

    static void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.printf("Hello,%s!",username);

    }
}