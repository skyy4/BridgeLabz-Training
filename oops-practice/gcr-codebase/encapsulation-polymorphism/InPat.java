interface Med {
    void add();
}

abstract class Pat {

    private int id;

    public Pat(int id) {
        this.id = id;
    }

    public abstract double bill();
}

public class InPat extends Pat implements Med {

    public InPat(int id) {
        super(id);
    }

    public double bill() {
        return 5000;
    }

    public void add() {}
}

