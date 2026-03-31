import java.util.*;

public class Program {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        try {
            double p = sc.nextDouble();
            int w = sc.nextInt();
            sc.nextLine();
            String m = sc.nextLine();

            RobotHazardAuditor r = new RobotHazardAuditor();
            double x = r.CalculateHazardRisk(p, w, m);
            System.out.println("Robot Hazard Risk Score: " + x);
        } catch (RobotSafetyException e) {
            System.out.println(e.getMessage());
        }
    }
}
