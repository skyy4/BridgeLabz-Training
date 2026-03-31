public class RobotHazardAuditor {
    public double CalculateHazardRisk(double a, int w, String m) throws RobotSafetyException {
        if (a < 0.0 || a > 1.0)
            throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
        if (w < 1 || w > 20)
            throw new RobotSafetyException("Error: Worker density must be 1-20");

        double f;
        if (m.equals("Worn"))
            f = 1.3;
        else if (m.equals("Faulty"))
            f = 2.0;
        else if (m.equals("Critical"))
            f = 3.0;
        else
            throw new RobotSafetyException("Error: Unsupported machinery state");

        return ((1.0 - a) * 15.0) + (w * f);
    }
}
