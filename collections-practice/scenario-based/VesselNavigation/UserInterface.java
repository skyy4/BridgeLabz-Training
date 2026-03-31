package VesselNavigation;

import java.util.*;

public class UserInterface {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        VesselUtil u = new VesselUtil();

        System.out.println("Enter the number of vessels to be added");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Enter vessel details");
        for (int i = 0; i < n; i++) {
            String[] d = sc.nextLine().split(":");
            Vessel v = new Vessel(d[0], d[1], Double.parseDouble(d[2]), d[3]);
            u.addVesselPerformance(v);
        }

        System.out.println("Enter the Vessel Id to check speed");
        String id = sc.nextLine();

        Vessel f = u.getVesselById(id);
        if (f != null) {
            System.out.println(f.getVesselId() + " | " + f.getVesselName() + " | " +
                    f.getVesselType() + " | " + f.getAverageSpeed() + " knots");
        } else {
            System.out.println("Vessel Id " + id + " not found");
        }

        System.out.println("High performance vessels are");
        for (Vessel v : u.getHighPerformanceVessels()) {
            System.out.println(v.getVesselId() + " | " + v.getVesselName() + " | " +
                    v.getVesselType() + " | " + v.getAverageSpeed() + " knots");
        }
        sc.close();
    }
}
