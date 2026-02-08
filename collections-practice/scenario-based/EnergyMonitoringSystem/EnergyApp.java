package scenario-based.EnergyMonitoringSystem;

import java.time.LocalDate;

public class EnergyApp {
    public static void main(String[] args) {
        EnergyMonitor monitor = new EnergyMonitor();

        try {
            monitor.addReading(LocalDate.of(2024, 3, 1), 12.5);
            monitor.addReading(LocalDate.of(2024, 3, 1), 10.0);
            monitor.addReading(LocalDate.of(2024, 3, 2), 15.0);
        } catch (InvalidEnergyReadingException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Daily Avg: " + monitor.dailyAverage(LocalDate.of(2024, 3, 1)));
        System.out.println("Monthly Avg: " + monitor.monthlyAverage(3));
    }
}
