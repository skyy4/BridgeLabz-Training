interface Disc {
    double disc();
}

abstract class Food {

    private double pr;
    private int q;

    public Food(double pr, int q) {
        this.pr = pr;
        this.q = q;
    }

    public double getPr() {
        return pr * q;
    }

    public abstract double tot();
}

public class NonVeg extends Food implements Disc {

    public NonVeg(double pr, int q) {
        super(pr, q);
    }

    public double tot() {
        return getPr() + 50;
    }

    public double disc() {
        return getPr() * 0.05;
    }
}

