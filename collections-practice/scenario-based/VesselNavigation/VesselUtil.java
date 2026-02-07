package VesselNavigation;

import java.util.*;

public class VesselUtil {
    private List<Vessel> vesselList = new ArrayList<>();

    public List<Vessel> getVesselList() {
        return vesselList;
    }

    public void setVesselList(List<Vessel> vesselList) {
        this.vesselList = vesselList;
    }

    public void addVesselPerformance(Vessel v) {
        vesselList.add(v);
    }

    public Vessel getVesselById(String id) {
        for (Vessel v : vesselList) {
            if (v.getVesselId().equals(id)) {
                return v;
            }
        }
        return null;
    }

    public List<Vessel> getHighPerformanceVessels() {
        List<Vessel> r = new ArrayList<>();
        double m = 0;

        for (Vessel v : vesselList) {
            if (v.getAverageSpeed() > m) {
                m = v.getAverageSpeed();
            }
        }

        for (Vessel v : vesselList) {
            if (v.getAverageSpeed() == m) {
                r.add(v);
            }
        }
        return r;
    }
}
