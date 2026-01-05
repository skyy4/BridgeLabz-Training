interface Gps {
    void loc();
}

abstract class Ride {

    private double rt;

    public Ride(double rt) {
        this.rt = rt;
    }

    public double getRt() {
        return rt;
    }

    public abstract double fare(double km);
}

public class Auto extends Ride implements Gps {

    public Auto(double rt) {
        super(rt);
    }

    public double fare(double km) {
        return getRt() * km;
    }

    public void loc() {}
}

