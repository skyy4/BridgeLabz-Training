interface Loan {
    double loan();
}

abstract class Acc {

    private int no;
    private double bal;

    public Acc(int no, double bal) {
        this.no = no;
        this.bal = bal;
    }

    public double getBal() {
        return bal;
    }

    public abstract double intt();
}

public class SavAcc extends Acc implements Loan {

    public SavAcc(int no, double bal) {
        super(no, bal);
    }

    public double intt() {
        return getBal() * 0.04;
    }

    public double loan() {
        return getBal() * 5;
    }
}

