interface Tax {
    double tax();
}

abstract class Prod {

    private String id;
    private double pr;

    public Prod(String id, double pr) {
        this.id = id;
        this.pr = pr;
    }

    public double getPr() {
        return pr;
    }

    public abstract double disc();
}

public class Elec extends Prod implements Tax {

    public Elec(String id, double pr) {
        super(id, pr);
    }

    public double disc() {
        return getPr() * 0.10;
    }

    public double tax() {
        return getPr() * 0.18;
    }
}

