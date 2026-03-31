import java.util.*;

public class SmartCheckout {

    Queue<String[]> q = new LinkedList<>();
    Map<String, Integer> price = new HashMap<>();
    Map<String, Integer> stock = new HashMap<>();

    void addCustomer(String name, String[] items) {
        q.add(items);
        System.out.println(name + " joined queue");
    }

    void checkout() {
        if (q.isEmpty()) {
            System.out.println("No customers");
            return;
        }

        String[] items = q.remove();
        int bill = 0;

        for (String it : items) {
            if (stock.get(it) > 0) {
                bill += price.get(it);
                stock.put(it, stock.get(it) - 1);
            }
        }

        System.out.println("Bill: " + bill);
    }

    public static void main(String[] args) {
        SmartCheckout s = new SmartCheckout();

        s.price.put("Milk", 40);
        s.price.put("Bread", 30);

        s.stock.put("Milk", 5);
        s.stock.put("Bread", 2);

        s.addCustomer("A", new String[] { "Milk", "Bread" });
        s.addCustomer("B", new String[] { "Milk", "Milk" });

        s.checkout();
        s.checkout();
    }
}
