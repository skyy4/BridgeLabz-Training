import java.util.*;

public class EventAnalyzer {

    Map<String, List<Integer>> map = new HashMap<>();

    public void addRating(String id, int r) throws InvalidRatingException {
        if (r < 1 || r > 5) {
            throw new InvalidRatingException("Invalid rating");
        }
        map.computeIfAbsent(id, k -> new ArrayList<>()).add(r);
    }

    public double avg(String id) {
        List<Integer> l = map.get(id);
        if (l == null) return 0;
        return l.stream().mapToInt(i -> i).average().orElse(0);
    }

    public String topEvent() {
        return map.entrySet().stream()
                .max(Comparator.comparingDouble(
                        e -> avg(e.getKey())
                ))
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public static void main(String[] args) throws Exception {
        EventAnalyzer ea = new EventAnalyzer();

        ea.addRating("EVT1", 5);
        ea.addRating("EVT1", 4);
        ea.addRating("EVT2", 3);
        ea.addRating("EVT2", 5);

        System.out.println(ea.avg("EVT1"));
        System.out.println("Top Event: " + ea.topEvent());
    }
}
