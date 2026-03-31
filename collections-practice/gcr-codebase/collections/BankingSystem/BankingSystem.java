import java.util.*;

public class BankingSystem {

    public static void main(String[] args) {

        Map<String, Integer> acc = new HashMap<>();
        acc.put("A101", 5000);
        acc.put("A102", 3000);
        acc.put("A103", 7000);

        Queue<String> q = new LinkedList<>();
        q.add("A101");
        q.add("A102");

        while (!q.isEmpty()) {
            String a = q.remove();
            acc.put(a, acc.get(a) - 1000);
        }

        TreeMap<Integer, String> sort = new TreeMap<>();

        for (String k : acc.keySet())
            sort.put(acc.get(k), k);

        System.out.println("Sorted by Balance:");
        System.out.println(sort);
    }
}
