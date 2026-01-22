import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {

        Map<String, Integer> price = new HashMap<>();
        price.put("Pen", 10);
        price.put("Book", 50);
        price.put("Bag", 200);

        Map<String, Integer> cart = new LinkedHashMap<>();
        cart.put("Book", 2);
        cart.put("Pen", 5);
        cart.put("Bag", 1);

        System.out.println("Cart Order:");
        System.out.println(cart);

        TreeMap<Integer, String> sort = new TreeMap<>();

        for (String k : cart.keySet())
            sort.put(price.get(k), k);

        System.out.println("Sorted by Price:");
        System.out.println(sort);
    }
}
