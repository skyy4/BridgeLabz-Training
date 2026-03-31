public class FlightUtil {

    public boolean validateFlightNumber(String f) throws InvalidFlightException {
        if (!f.matches("FL-[1-9][0-9]{3}"))
            throw new InvalidFlightException("The flight number " + f + " is invalid");
        return true;
    }

    public boolean validateFlightName(String n) throws InvalidFlightException {
        if (!(n.equalsIgnoreCase("SpiceJet") ||
                n.equalsIgnoreCase("Vistara") ||
                n.equalsIgnoreCase("IndiGo") ||
                n.equalsIgnoreCase("Air Arabia")))
            throw new InvalidFlightException("The flight name " + n + " is invalid");
        return true;
    }

    public boolean validatePassengerCount(int c, String n) throws InvalidFlightException {
        int m = 0;
        if (n.equalsIgnoreCase("SpiceJet"))
            m = 396;
        else if (n.equalsIgnoreCase("Vistara"))
            m = 615;
        else if (n.equalsIgnoreCase("IndiGo"))
            m = 230;
        else if (n.equalsIgnoreCase("Air Arabia"))
            m = 130;

        if (c <= 0 || c > m)
            throw new InvalidFlightException("The passenger count " + c + " is invalid for " + n);
        return true;
    }

    public double calculateFuelToFillTank(String n, double f) throws InvalidFlightException {
        double c = 0;
        if (n.equalsIgnoreCase("SpiceJet"))
            c = 200000;
        else if (n.equalsIgnoreCase("Vistara"))
            c = 300000;
        else if (n.equalsIgnoreCase("IndiGo"))
            c = 250000;
        else if (n.equalsIgnoreCase("Air Arabia"))
            c = 150000;

        if (f < 0 || f > c)
            throw new InvalidFlightException("Invalid fuel level for " + n);

        return c - f;
    }
}
