interface Ins {
    double ins();
}

abstract class Veh {

    private String no;
    private double rt;

    public Veh(String no, double rt) {
        this.no = no;
        this.rt = rt;
    }

    public double getRt() {
        return rt;
    }

    public abstract double rent(int d);
}

public class Car extends Veh implements Ins {

    public Car(String no, double rt) {
        super(no, rt);
    }

    public double rent(int d) {
        return getRt() * d;
    }

    public double ins() {
        return 500;
    }
}

