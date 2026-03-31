
import java.time.LocalDate;
import java.util.*;

public class EnergyMonitor {
    private Map<LocalDate, List<Double>> data = new HashMap<>();

    public void addReading(LocalDate date, double value) throws InvalidEnergyReadingException {
        if (value < 0) {
            throw new InvalidEnergyReadingException("Invalid energy reading");
        }
        data.computeIfAbsent(date, d -> new ArrayList<>()).add(value);
    }

    public double dailyAverage(LocalDate date) {
        List<Double> list = data.get(date);
        return list.stream().mapToDouble(d -> d).average().orElse(0);
    }

    public double monthlyAverage(int month) {
        return data.entrySet().stream()
                .filter(e -> e.getKey().getMonthValue() == month)
                .flatMap(e -> e.getValue().stream())
                .mapToDouble(d -> d)
                .average()
                .orElse(0);
    }
}
