public class CarRental {

    private String cnm;
    private String mdl;
    private int d;
    private double tot;

    public CarRental(String cnm, String mdl, int d) {
        this.cnm = cnm;
        this.mdl = mdl;
        this.d = d;
        this.tot = cal();
    }

    // Encapsulated cost logic
    private double cal() {
        return d * 1000;
    }

    public double getTot() {
        return tot;
    }
}

