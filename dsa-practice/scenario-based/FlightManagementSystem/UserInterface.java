import java.util.*;

public class UserInterface {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        try {
            if (sc.hasNextLine()) {
                String s = sc.nextLine();
                if (s != null && !s.isEmpty()) {
                    String[] x = s.split(":");
                    if (x.length >= 4) {
                        String fn = x[0];
                        String n = x[1];
                        int p = Integer.parseInt(x[2]);
                        double f = Double.parseDouble(x[3]);

                        FlightUtil u = new FlightUtil();
                        u.validateFlightNumber(fn);
                        u.validateFlightName(n);
                        u.validatePassengerCount(p, n);

                        double r = u.calculateFuelToFillTank(n, f);
                        System.out.println("Fuel required to fill the tank: " + r + " liters");
                    } else {
                        System.out.println("Invalid input format. Expected: FL-XXXX:Airline:Passengers:CurrentFuel");
                    }
                }
            }
        } catch (InvalidFlightException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing numbers from input.");
        }
    }
}
